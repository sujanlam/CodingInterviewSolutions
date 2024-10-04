package strings;


import java.util.HashMap;
import java.util.Map;

public class LongestSubstriingWIthoutRepChars {
    public static void main(String[] args) {
        String str = "adbdecde";
        System.out.println(aa(str));
    }

    private static int lengthOfLongestStrWithORepChars(String str) {
        Map<Character, Integer> map = new HashMap<>();
        int left = 0;
        int maxCount = 0;

        for (int right = left; right < str.length(); right++) {
            char ch = str.charAt(right);
            if (map.containsKey(ch)) {
                left = Math.max(left, map.get(ch) + 1);
            }
            map.put(ch, right);
            maxCount = Math.max(maxCount, right - left + 1);
        }
        return maxCount;
    }

    private static int aa(String str) {
        Map<Character, Integer> map = new HashMap<>();
        int left = 0;
        int maxCount = 0;

        for (int right = left; right < str.length(); right++) {
            char ch = str.charAt(right);
            if (map.containsKey(ch)) {
                left = Math.max(left, map.get(ch)+1);
            }

            map.put(ch, right);
            maxCount = Math.max(maxCount, right - left + 1);
        }
        return maxCount;
    }
}
