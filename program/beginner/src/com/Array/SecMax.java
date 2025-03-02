package com.Array;

import java.util.Scanner;

public class SecMax {
public static void main(String[] args) {
	Scanner in = new Scanner(System.in);
	int size = in.nextInt();
	int[] arr = new int[size];
	for (int i = 0; i < size; i++) {
		arr[i] = in.nextInt();
	}
	int max = Integer.MIN_VALUE, sec = Integer.MIN_VALUE;
	for (int i : arr) {
		if (i > max) {
			sec = max;
			max = i;
		} else if (i > sec && i != max) {
			sec = i;
		}
		
	}
	System.out.println(sec);
}
}
