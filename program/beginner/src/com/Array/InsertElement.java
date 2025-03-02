package com.Array;

import java.util.Arrays;
import java.util.Scanner;

public class InsertElement {
public static void main(String[] args) {
	Scanner in = new Scanner(System.in);
	int size = in.nextInt();
	int[] arr = new int[size + 1];
	arr[size] = 0;
	for (int i = 0; i < size; i++) {
		arr[i] = in.nextInt();
	}
	int index = in.nextInt();
	if (index < arr.length - 1 && index >= 0) {
		int value = in.nextInt();
		for (int i = arr.length - 1; i > index; i--) {
			arr[i] = arr[i - 1];
		}
		arr[index] = value;
		System.out.println(Arrays.toString(arr));
	} else {
		System.out.println("Index Not Exist!..");
	}
}
}
