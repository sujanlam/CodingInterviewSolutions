package com.probs;

public class FIndIfWordExistsInMatrix {
    public static void main(String[] args) {
        char[][] board = {
                {'A', 'B', 'C', 'E'},
                {'S', 'F', 'C', 'S'},
                {'A', 'D', 'E', 'E'}
        };
        String word = "ABCCCED";

        System.out.println(wordExists(board, word));
    }

    private static boolean wordExists(char[][] board, String word) {
        int rows = board.length;
        int cols = board[0].length;

        if (word.length() > rows * cols) {
            return false;
        }
        boolean[][] visited = new boolean[rows][cols];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                if (checkEverythingRecursively(board, word, visited, i, j, 0)) {
                    return true;
                }
            }
        }
        return false;
    }

    private static boolean checkEverythingRecursively(char[][] board, String word, boolean[][] visited, int row, int col, int index) {
        if (index == word.length()) {
            return true;
        }

        if (row < 0 || row >= board.length || col < 0 || col >= board[0].length || visited[row][col] || board[row][col] != word.charAt(index)) {
            return false;
        }
        visited[row][col] = true;

        boolean found = checkEverythingRecursively(board, word, visited, row + 1, col, index + 1) ||
                checkEverythingRecursively(board, word, visited, row - 1, col, index + 1) ||
                checkEverythingRecursively(board, word, visited, row, col + 1, index + 1) ||
                checkEverythingRecursively(board, word, visited, row, col - 1, index + 1);

        visited[row][col] = false;

        return found;
    }
}
