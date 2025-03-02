package com.Array;

import java.util.Arrays;
import java.util.Scanner;

public class DeleteElement {
public static void main(String[] args) {
	Scanner in = new Scanner(System.in);
	int size = in.nextInt();
	int[] arr = new int[size];
	for (int i = 0; i < size; i++) {
		arr[i] = in.nextInt();
	}
	int index = in.nextInt();
	if (index < arr.length && index >= 0) {
		for (int i = index; i < arr.length; i++) {
			if (i < arr.length - 1) {
				arr[i] = arr[i + 1];
			}
		}
		arr = Arrays.copyOf(arr, arr.length - 1);
		System.out.println(Arrays.toString(arr));
	} else {
		System.out.println("Invalid Index!...");
	}
}
}
