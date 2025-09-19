package com.Array;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class IndexExtraElement {
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
	Set<Integer> sub = new HashSet<>();
	for (int i : arr2) {
		sub.add(i);
	}
	for (int i = 0; i < arr1.length; i++) {
		if (!sub.contains(arr1[i])) {
			System.out.println(i);
		}
	}
}
}
