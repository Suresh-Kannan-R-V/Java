package com.Array;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class AllNegativeToEnd {
public static void main(String[] args) {
	Scanner in = new Scanner(System.in);
	int size = in.nextInt();
	int[] arr = new int[size];
	for (int i = 0; i < size; i++) {
		arr[i] = in.nextInt();
	}
	List<Integer> result = new ArrayList<>();
	for (int i : arr) {
		if (i >= 0) {
			result.add(i);
		}
	}
	for (int i : arr) {
		if (i < 0) {
			result.add(i);
		}
	}
	System.out.println(arr.toString());
}
}
