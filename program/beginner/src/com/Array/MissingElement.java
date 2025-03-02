package com.Array;

import java.util.Arrays;
import java.util.Scanner;

public class MissingElement {
public static void main(String[] args) {
	Scanner in = new Scanner(System.in);
	int size = in.nextInt();
	int[] arr = new int[size];
	for (int i = 0; i < size; i++) {
		arr[i] = in.nextInt();
	}
	Arrays.sort(arr);
	int s = size + 1; // Default missing number if no gaps are found
	for (int i = 0; i < arr.length; i++) {
		if (arr[i] != (i + 1)) {
			s = i + 1;
			break;
		}
	}
	System.out.println(s);
}
}
