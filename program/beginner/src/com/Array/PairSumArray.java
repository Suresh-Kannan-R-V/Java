package com.Array;

import java.util.Scanner;

public class PairSumArray {
public static void main(String[] args) {
	Scanner in = new Scanner(System.in);
	int size = in.nextInt();
	int[] arr = new int[size];
	for (int i = 0; i < size; i++) {
		arr[i] = in.nextInt();
	}
	int target = in.nextInt();
	boolean result = false;
	for (int i : arr) {
		for (int j : arr) {
			if ((i + j) == target) {
				result = true;
			}
		}
	}
	System.out.println(result);
}
}
