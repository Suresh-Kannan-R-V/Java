package com.Array;

import java.util.Arrays;
import java.util.Scanner;

public class NegativeNumber {
public static void main(String[] args) {
	Scanner in = new Scanner(System.in);
	int[] arr = new int[5];
	for (int i = 0; i < 5; i++) {
		arr[i] = in.nextInt();
	}
	int siz = 0;
	int[] arr1 = new int[arr.length];
	for (int i : arr) {
		if (i < 0) {
			arr1[siz] = i;
			siz++;
		}
	}
	arr1 = Arrays.copyOf(arr1,siz);
	System.out.println(Arrays.toString(arr1));
}
}
