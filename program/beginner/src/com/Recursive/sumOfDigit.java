package com.Recursive;

import java.util.Scanner;

public class sumOfDigit {
public static void main(String[] args) {
	Scanner in = new Scanner(System.in);
	int a = in.nextInt();
	System.out.println(sumofDigit(a));
	System.out.println(iterativeSumofDigit(a));
}

public static int sumofDigit(int n) {
	if (n == 0) return 0;
	return sumofDigit(n / 10) + n % 10;
}

public static int iterativeSumofDigit(int n) {
	int sum = 0;
	while (n != 0) {
		sum += n % 10;
		n /= 10;
	}
	return sum;
}
}
