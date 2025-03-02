package com.FunctionReturn;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class ArrayListType {
public static void main(String[] args) {
	Scanner in = new Scanner(System.in);
	int size = in.nextInt();
	int[] arr = new int[size];
	for (int i = 0; i < size; i++) {
		arr[i] = in.nextInt();
	}
	int x = in.nextInt();
	System.out.println(FirstLast(arr, x));
}

static ArrayList<Integer> FirstLast(int arr[], int x) {
	int first = -1, last = -1;
	for (int i = 0; i < arr.length; i++) {
		if (arr[i] == x && first == -1) {
			first = i;
			last = i;
		}
		if (arr[i] == x) {
			last = i;
		}
	}
	return new ArrayList<>(Arrays.asList(first, last));
}
}
