package patternmatching;

public class CountLowerCaseRepeating {
    public static void main(String[] args) {
        //String input = "aaAbcCABBc";
        //String input = "xyzXYZabcABC";
        String input = "ABCabcAEefGE";
        int result = countMatchingLetters(input);
        System.out.println("Number of distinct letters appearing in both uppercase and lowercase: " + result);
    }

    public static int countMatchingLetters(String s) {
        int[] alphabets = new int[26];
        int count = 0;
        for (int i = 0; i < s.length(); i++) {
            if (Character.isLowerCase(s.charAt(i))) {
                int location = s.charAt(i) - 'a';
                //System.out.println(location);
                if (alphabets[location] == 0) {
                    alphabets[location] = 1;
                } else if (alphabets[location] == 2) {
                    alphabets[location] = -1;
                }
            } else {
                char temp = Character.toLowerCase(s.charAt(i));
                int location = temp - 'a';
                if (alphabets[location] == 0) {
                    alphabets[location] = -1;
                } else if (alphabets[location] == 1) {
                    alphabets[location] = 2;
                }
            }
        }
        for (int aplhCount : alphabets) {
            System.out.print(aplhCount + " ");
            if (aplhCount == 2) {
                count++;
            }
        }

        return count;
    }

}
