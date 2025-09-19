package com.Recursive;

import java.util.Scanner;

public class TaylorSeries {
static double taylor = 1;

public static void main(String[] args) {
	Scanner in = new Scanner(System.in);
	System.out.print("Enter x: ");
	int x = in.nextInt();
	System.out.print("Enter number of terms (n): ");
	int n = in.nextInt();
	System.out.printf("%.6f\n", taylor(x, n));
	System.out.printf("%.6f\n", optimizeTaylor(x, n));
	System.out.printf("%.6f\n", Math.exp(x));
}

static double taylor(int a, int count) {
	if (count == 0) return 1;
	double res = power(a, count) / fact(count);
	return res + taylor(a, count - 1);
}

static double optimizeTaylor(int x, int n) {
	if (n == 0) return taylor;
	taylor = 1 + (x * taylor) / n;
	return optimizeTaylor(x, n - 1);
}


static long fact(int n) {
	if (n == 1 || n == 0) return 1;
	return n * fact(n - 1);
}

static double power(int n, int x) {
	if (x == 0) return 1;
	return n * power(n, x - 1);
}
}


//1. Make sure of definining the return type of the function correctly
//2. Fide the base for recursion