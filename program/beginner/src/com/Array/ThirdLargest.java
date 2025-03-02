package com.Array;

import java.util.Scanner;

public class ThirdLargest {
public static void main(String[] args) {
	Scanner in = new Scanner(System.in);
	int size = in.nextInt();
	int[] arr = new int[size];
	for (int i = 0; i < size; i++) {
		arr[i] = in.nextInt();
	}
	int first = -1, second = -1, third = -1;
	for (int i : arr) {
		if (i > first) {
			third = second;
			second = first;
			first = i;
		} else if (i >= second && i <= first) {
			third = second;
			second = i;
		} else if (i >= third && i <= second) {
			third = i;
		}
	}
	System.out.println(third);
}
}
