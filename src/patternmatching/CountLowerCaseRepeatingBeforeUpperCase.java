package patternmatching;

import java.util.HashSet;
import java.util.Set;

public class CountLowerCaseRepeatingBeforeUpperCase {
    public static void main(String[] args) {
        String input = "ABCabcAefG";
        int result = countMatchingLetters(input);
        System.out.println("Number of distinct letters appearing in both uppercase and lowercase: " + result);
    }

    public static int countMatchingLetters(String letters) {
        Set<Character> lowercaseSet = new HashSet<>();
        Set<Character> uppercaseSet = new HashSet<>();
        int count = 0;

        for (char c : letters.toCharArray()) {
            if (Character.isLowerCase(c)) {
                lowercaseSet.add(c);
            } else if (Character.isUpperCase(c)) {
                char lowercaseVersion = Character.toLowerCase(c);
                if (lowercaseSet.contains(lowercaseVersion) && !uppercaseSet.contains(lowercaseVersion)) {
                    count++;
                    uppercaseSet.add(lowercaseVersion); // Mark as counted in uppercase set
                }
            }
        }

        return count;
    }
}
