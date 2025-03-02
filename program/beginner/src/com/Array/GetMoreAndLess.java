package com.Array;

import java.util.Scanner;

public class GetMoreAndLess {
public static void main(String[] args) {
	Scanner in = new Scanner(System.in);
	int size = in.nextInt();
	int[] arr = new int[size];
	for (int i = 0; i < size; i++) {
		arr[i] = in.nextInt();
	}
	int target = in.nextInt();
	int more = 0, less = 0;
	for (int i :arr) {
		if (i <= target) {
			less++;
		}
		if (i >= target) {
			more++;
		}
	}
	System.out.println(less + " " + more);
}
}
