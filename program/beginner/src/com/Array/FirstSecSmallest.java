package com.Array;

import java.util.Scanner;

public class FirstSecSmallest {
public static void main(String[] args) {
	Scanner in = new Scanner(System.in);
	int size = in.nextInt();
	int[] arr = new int[size];
	for (int i = 0; i < size; i++) {
		arr[i] = in.nextInt();
	}
	int first = Integer.MAX_VALUE, second = Integer.MAX_VALUE;
	for (int i : arr) {
		if (i < first) {
			second = first;
			first = i;
		} else if (i < second && i > first) {
			second = i;
		}
	}
	System.out.println((second == Integer.MAX_VALUE) ? -1 : first + " " + second);
}
}
