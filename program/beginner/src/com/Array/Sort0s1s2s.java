package com.Array;

import java.util.Arrays;
import java.util.Scanner;

public class Sort0s1s2s {
public static void main(String[] args) {
	Scanner in = new Scanner(System.in);
	int size = in.nextInt();
	int[] arr = new int[size];
	for (int i = 0; i < size; i++) {
		arr[i] = in.nextInt();
	}
	Arrays.sort(arr);
	System.out.println(Arrays.toString(arr));
}
}
