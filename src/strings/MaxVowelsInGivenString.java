package com.codes.strings;

public class MaxVowelsInGivenString {
    public static void main(String[] args) {
        //String and length of substring
        //Please!!! Need to work on this issue later
        String s = "weallloveyou";
        int k = 7;
        System.out.println(maxVowles(s, k));
    }

    private static int maxVowles(String s, int k) {
        int count = 0;
        String vowels = "aeiou";
        int lengthofS = s.length();
        for (int i = 0; i <= s.length() - k; i++) {
            int tempCount = 0;
            String tempStr = s.substring(i, k + i);
            for (int j = 0; j < tempStr.length(); j++) {
                char v = tempStr.charAt(j);
                if (vowels.indexOf(v) != -1) {
                    tempCount++;
                }
                }
                count = Math.max(tempCount, count);

        }


        return count;
    }
}
