package slidingwindow;

import java.util.ArrayList;
import java.util.List;

public class PrintAllPalindromicSequencen2 {
    public static void main(String[] args) {
        String str = "appa";
        int allPls = countPalindromes(str);

        System.out.println(allPls);
    }

    private static int countPalindromes(String str) {
        int n = str.length();
        int palCount = 0;

        for (int i = 0; i < n; i++) {
            //If odd
            palCount += expandFromCenter(str, i, i);
            //If even
            if (i + 1 < n) {
                palCount += expandFromCenter(str, i, i + 1);
            }
        }

        return palCount;
    }

    public static int expandFromCenter(String str, int left, int right) {
        int count = 0;
        while (left >= 0 && right < str.length() && str.charAt(left) == str.charAt(right)) {
            count++;
            left--;
            right++;
        }
        return count;
    }
}
