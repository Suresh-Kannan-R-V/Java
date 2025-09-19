package com.Maths;

import java.util.Arrays;
import java.util.Scanner;

public class SieveLogic {
public static void main(String[] args) {
	Scanner in = new Scanner(System.in);
	int a = in.nextInt();
	System.out.println(countPrimes(a));
}

public static int countPrimes(int n) {
	if (n < 2) return 0;
	boolean[] result = new boolean[n];
	Arrays.fill(result, true);
	result[0] = false;
	result[1] = false;
	for (int i = 2; i * i < n; i++) {
		if (result[i]) {
			for (int j = i * i; j < n; j += i) {
				result[j] = false;
			}
		}
	}
	int count = 0;
	for (boolean r : result) {
		if (r) count++;
	}
	return count;
}
}
