package com.Array;

import java.util.Scanner;

public class FirstRepeating {
public static void main(String[] args) {
	Scanner in = new Scanner(System.in);
	int size = in.nextInt();
	int[] arr = new int[size];
	for (int i = 0; i < size; i++) {
		arr[i] = in.nextInt();
	}
	int a = -1;
	for (int i = 0; i < arr.length; i++) {
		boolean f = false;
		for (int j = i + 1; j < arr.length; j++) {
			if (arr[i] == arr[j]) {
				f = true;
				a = arr[i];
				break;
			}
		}
		if (f) {
			break;
		}
	}
	System.out.println(a);
}
}
