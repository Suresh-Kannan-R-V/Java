package com.Array;

import java.util.Scanner;

public class SecMin {
public static void main(String[] args) {
	Scanner in = new Scanner(System.in);
	int size = in.nextInt();
	int[] arr = new int[size];
	for (int i = 0; i < size; i++) {
		arr[i] = in.nextInt();
	}
	int min = Integer.MAX_VALUE, sec = Integer.MAX_VALUE;
	for (int i : arr) {
		if (i < min) {
			sec = min;
			min = i;
		} else if (i < sec && i != min) {
			sec = i;
		}
		
	}
	System.out.println(sec);
}
}
