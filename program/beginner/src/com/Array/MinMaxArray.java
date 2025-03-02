package com.Array;

import java.util.Scanner;

public class MinMaxArray {
public static void main(String[] args) {
	Scanner in = new Scanner(System.in);
	int size = in.nextInt();
	int[] arr = new int[size];
	for (int i = 0; i < size; i++) {
		arr[i] = in.nextInt();
	}
	int max = arr[0], min = arr[0];
	for (int i : arr) {
		if (i > max) {
			max = i;
		}
		if (i < min) {
			min = i;
		}
	}
	System.out.println(min + " " + max);
}
}
