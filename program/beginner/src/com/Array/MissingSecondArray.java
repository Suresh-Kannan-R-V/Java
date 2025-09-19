package com.Array;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class MissingSecondArray {
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
//	findMissing(arr1, arr2);
	ArrayList<Integer> result = new ArrayList<>();
	for (int i : arr1) {
		if (find(arr2, i)) {
			result.add(i);
		}
	}
	System.out.println(result.toString());
}

static boolean find(int[] arr, int target) {
	int count = 0;
	for (int i : arr) {
		count += 1;
		if (i == target) {
			break;
		}
		if (count == arr.length) {
			return true;
		}
	}
	return false;
}

//O(N + M)
//static ArrayList<Integer> findMissing(int[] a, int[] b) {
//	ArrayList<Integer> result = new ArrayList<>();
//	Set<Integer> arrB = new HashSet<>();
//	for (int i : b) {
//		arrB.add(i);
//	}
//	for (int val : a) {
//		if (!arrB.contains(val)) {
//			result.add(val);
//		}
//	}
//	return result;
//}
}

/*
input

6
5
1 2 3 4 5 10
2 3 1 0 5

Your program took more time than expected.Expected Time Limit : 2.46sec
*/
