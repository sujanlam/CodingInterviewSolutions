package strings;

import java.util.Arrays;
import java.util.List;

public class LongestCommonSequence {
    public static void main(String[] args) {
        String text1 = "abcde";
        String text2 = "ace";
        System.out.println(longestCommonSubsequence(text1, text2));
    }

    private static int longestCommonSubsequence(String text1, String text2) {
        final int m = text1.length();
        final int n = text2.length();
        int[][] dp = new int[m + 1][n + 1];

        for (int i = 0; i < m; i++){
            for (int j = 0; j < n; j++){
                if(text1.charAt(i) == text2.charAt(j)){
                    dp[i+1][j+1] += 1;
                }else{
                    dp[i+1][j+1] = Math.max(dp[i][j+1], dp[i+1][j]);
                }


            }
        }
        return dp[m][n];
    }

}
