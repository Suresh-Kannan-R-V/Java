package com.Array;

import java.util.Scanner;

public class PeakElement {
public static void main(String[] args) {
	Scanner in = new Scanner(System.in);
	int size = in.nextInt();
	int[] arr = new int[size];
	for (int i = 0; i < size; i++) {
		arr[i] = in.nextInt();
	}
	int result = 0;
	for (int i = arr.length - 1; i > 0; i--) {
		if (i == arr.length-1 && arr[i - 1] < arr[i]) {
			result = arr[i];
			break;
		}
		else if (arr[i - 1] < arr[i] && arr[i] > arr[i + 1]) {
			result = arr[i];
			break;
		}
		else{
			result = arr[0];
			break;
		}
	}
	System.out.println(result != 0 ? result : arr[arr.length - 1]);
}
}
