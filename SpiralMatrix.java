package org.example;

import java.util.ArrayList;
import java.util.List;

public class SpiralMatrix {
    public static void main(String[] args) {
        int[][] matrix = {
                {1, 3, 5},
                {7, 9, 11},
                {13, 15, 17}
        };
        List<Integer> listFromMatrix = flattenMatrixSpirally(matrix);
        System.out.println(listFromMatrix);
    }

    private static List<Integer> flattenMatrixSpirally(int[][] matrix) {
        List<Integer> flattenedList = new ArrayList<>();
        int left = 0;
        int top = 0;
        int right = matrix.length - 1;
        int bottom = matrix[0].length - 1;
        while (left <= right && top <= bottom) {
            //left to right
            for (int i = left; i <= right; i++) {
                flattenedList.add(matrix[top][i]);
            }
            top++;
            //System.out.println(flattenedList);
            //top to bottom
            for (int i = top; i <= bottom; i++) {
                flattenedList.add(matrix[i][right]);
            }
            right--;

            // right to left
            if (top <= bottom) {
                for (int i = right; i >= left; i--) {
                    flattenedList.add(matrix[bottom][i]);
                }
                bottom--;
            }

            //bottom to top
            if (left <= right) {
                for (int i = bottom; i >= top; i--) {
                    flattenedList.add(matrix[i][left]);
                }
                left++;
            }

        }
        return flattenedList;
    }
}
