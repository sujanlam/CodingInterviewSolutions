package test;

public class FindGardenSquare {
    public static void main(String[] args) {
        String[][] garden = {
                {"Iris", "Iris", "Iris"},
                {"Iris", "Iris", "Iris"},
                {"Iris", "Iris", "Rose"}
        };
        String[][] garden_temp = {
                {"Iris", "Iris", "Iris", "Iris"},
                {"Iris", "Iris", "Iris", "Iris"},
                {"Iris", "Iris", "Iris", "Iris"},
                {"Rose", "Iris", "Iris", "Iris"}
        };
        String[][] garden_9 = {
                {"Iris", "Iris", "Rose", "Rose", "Iris", "Iris", "Iris"},
                {"Iris", "Iris", "Rose", "Rose", "Rose", "Rose", "Lily"},
                {"Iris", "Iris", "Rose", "Rose", "Rose", "Rose", "Lily"},
                {"Iris", "Iris", "Rose", "Rose", "Rose", "Rose", "Lily"},
                {"Iris", "Iris", "Rose", "Rose", "Rose", "Rose", "Lily"},
                {"Iris", "Iris", "Sage", "Sage", "Sage", "Sage", "Lily"}
        };


        System.out.println(findLargestSquare(garden));
        System.out.println(findLargestSquare(garden_9));
    }

    public static int findLargestSquare(String[][] garden) {
        int maxSize = 0;
        int rowSize = garden.length;
        int colSize = garden[0].length;
        int dp[][] = new int[rowSize][colSize];

        for (int i = 0; i < rowSize; i++) {
            for (int j = 0; j < colSize; j++) {
                if (i == 0 || j == 0) {
                    dp[i][j] = 1;
                } else if (garden[i][j].equals(garden[i - 1][j]) &&
                        garden[i][j].equals(garden[i][j - 1]) &&
                        garden[i][j].equals(garden[i - 1][j - 1])) {
                    dp[i][j] = Math.min(Math.min(dp[i-1][j], dp[i][j-1]), dp[i - 1][j - 1]) + 1;
                }

                maxSize = Math.max(maxSize, dp[i][j]);
            }
        }

        return maxSize * maxSize;
    }

}
