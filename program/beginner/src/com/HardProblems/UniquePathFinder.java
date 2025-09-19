package com.HardProblems;

import java.util.Arrays;
import java.util.Scanner;

public class UniquePathFinder {

    public static int RecursionMethod(int m, int n) {
        if (m == 1 || n == 1) return 1;
        return RecursionMethod(m - 1, n) + RecursionMethod(m, n - 1);
    }

    public static int uniqueFromMatrix(int m, int n) {
        if (m == 1 || n == 1) return 1;
        int[][] arr = new int[m][n];
        for (int i = 0; i < m; i++)
            arr[i][0] = 1;
        for (int i = 0; i < n; i++)
            arr[0][i] = 1;

        for (int i = 1; i < m; i++) {
            for (int j = 1; j < n; j++) {
                arr[i][j] = arr[i - 1][j] + arr[i][j - 1];
            }
        }
        return arr[m - 1][n - 1];
    }

    public static int FormulaMethod(int m, int n) {
        int totalSteps = m + n - 2;
        int downSteps = m - 1;

        long result = 1;

        for (int i = 1; i <= downSteps; i++) {
            result = result * (totalSteps - downSteps + i) / i;
        }
        return (int)result;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int m = in.nextInt(), n = in.nextInt();
        System.out.println(uniqueFromMatrix(m, n));
//        System.out.println(RecursionMethod(m, n));
        System.out.println(FormulaMethod(m, n));

    }
}
