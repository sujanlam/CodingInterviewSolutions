package strings;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class LongestSubstrWithNonRepeatingChars {
    public static void main(String[] args) {
        String str = "dvdf";
        System.out.println(getLongestWONonRepeatChars(str));
    }    public static int getLongestWONonRepeatChars(String s) {
        int maxLen = 0;
        int left = 0;
        int lenOfStr = s.length();
        Map<Character, Integer> mapOfChars = new HashMap<>();
        for (int right = 0; right < lenOfStr; right++) {
            char newChar = s.charAt(right);
            if (!mapOfChars.containsKey(newChar)) {
                mapOfChars.put(newChar, 1);
            } else {
                left++;
                right=left;
                char leftChar = s.charAt(left);
                mapOfChars.clear();
                mapOfChars.put(leftChar, 1);
            }
            maxLen = Math.max(maxLen, mapOfChars.size());
        }
        return maxLen;
    }
}
