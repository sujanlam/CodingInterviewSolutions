package test;

public class Garden {
    public static void main(String[] args) {
        String[][] garden = {
                {"Iris", "Iris", "Iris"},
                {"Iris", "Iris", "Iris"},
                {"Iris", "Iris", "Rose"}
        };

        System.out.println(findLargestSquare(garden));
    }

    public static int findLargestSquare(String[][] garden) {
        int maxSize = 0;
        int rows = garden.length;
        int cols = garden[0].length;

        int[][] dp = new int[rows][cols];

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                if (i == 0 || j == 0) {
                    dp[i][j] = 1;
                } else if (garden[i][j].equals(garden[i - 1][j]) &&
                        garden[i][j].equals(garden[i][j - 1]) &&
                        garden[i][j].equals(garden[i - 1][j - 1])) {
                    dp[i][j] = Math.min(Math.min(dp[i - 1][j], dp[i][j - 1]), dp[i - 1][j - 1]) + 1;
                } else {
                    dp[i][j] = 1;
                }
                maxSize = Math.max(maxSize, dp[i][j]);
            }
        }

        return maxSize * maxSize;
    }
}
