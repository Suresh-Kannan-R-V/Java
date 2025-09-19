package com.HardProblems;

import java.util.Scanner;

public class TowerOfHanoi {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        TOH(n,'A','B','C');
    }

    public static void TOH(int n, char from, char to, char help) {
        if (n == 1) {
            System.out.println("Move disk 1 from " + from + " to " + to);
            return;
        }
        TOH(n - 1, from, help, to);
        System.out.println("Move disk " + n + " from " + from + " to " + to);
        TOH(n - 1, help, to, from);
    }
}
