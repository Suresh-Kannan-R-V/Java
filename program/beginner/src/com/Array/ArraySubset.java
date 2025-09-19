package com.Array;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ArraySubset {
public static void main(String[] args) {
	Scanner in = new Scanner(System.in);
	int size1 = in.nextInt(), size2 = in.nextInt();
	int[] arr1 = new int[size1], arr2 = new int[size2];
	for (int i = 0; i < size1; i++) {
		arr1[i] = in.nextInt();
	}
	for (int i = 0; i < size2; i++) {
		arr2[i] = in.nextInt();
	}
//	boolean result = false;
	List<Integer> result = new ArrayList<>();
	for (int i : arr2) {
		for (int j : arr1) {
			if (i == j) {
				result.add(i);
				break;
			}
		}
	}
	System.out.println(result.toString());
	System.out.println(result.size()==arr2.length);
}
}
