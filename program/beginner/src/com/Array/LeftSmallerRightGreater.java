package com.Array;

import java.util.Scanner;

public class LeftSmallerRightGreater {
public static void main(String[] args) {
	Scanner in = new Scanner(System.in);
	int size = in.nextInt();
	int[] arr = new int[size];
	for (int i = 0; i < size; i++) {
		arr[i] = in.nextInt();
	}
	int result = -1;
	for (int i = arr.length - 2; i >= 0; i--) {
		if (right1(arr, i) && left(arr, i)) {
			result = arr[i];
			break;
		}
	}
	System.out.println(result);
}

static boolean left(int[] arr, int index) {
	boolean result = false;
	for (int i = 0; i < index; i++) {
		if (arr[index] > arr[i]) {
			result = true;
		} else {
			return false;
		}
	}
	return result;
}

static boolean right1(int[] arr, int index) {
	boolean result = false;
	for (int i = arr.length - 1; i > index; i--) {
		if (arr[index] < arr[i]) {
			result = true;
		} else {
			return false;
		}
	}
	return result;
}
}
