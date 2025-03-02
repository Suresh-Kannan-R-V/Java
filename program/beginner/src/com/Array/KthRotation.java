package com.Array;

import java.util.Scanner;

public class KthRotation {
public static void main(String[] args) {
	Scanner in = new Scanner(System.in);
	int size = in.nextInt(), result = 0;
	int[] arr = new int[size];
	for (int i = 0; i < size; i++) {
		arr[i] = in.nextInt();
	}
	for (int i = 0; i < arr.length - 1; i++) {
		if (arr[i] > arr[i + 1]) {
			result = i + 1;
		}
	}
	System.out.println(result);
}
}
