package com.Array.MatrixBinarySearch;

public class TwoDMatrixSearch {
    public static void main(String[] args) {

    }

    static int[] binarySearch(int[][] arr, int target) {
        int row = 0, col = arr.length - 1;

        while (row < arr.length && col >= 0) {
            if (arr[row][col] == target) return new int[]{row, col};
            else if (arr[row][col] > target) row++;
            else if (arr[row][col] < target) col--;
        }
        return new int[]{-1,-1};
    }
}
