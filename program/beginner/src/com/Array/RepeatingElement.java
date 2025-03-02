package com.Array;
//https://www.geeksforgeeks.org/problems/two-repeated-elements-1587115621/1?page=2&category=Arrays&sortBy=submissions

import java.util.Arrays;
import java.util.Scanner;

public class RepeatingElement {
public static void main(String[] args) {
	Scanner in = new Scanner(System.in);
	int size = in.nextInt();
	int[] arr = new int[size];
	for (int i = 0; i < size; i++) {
		arr[i] = in.nextInt();
	}
	//sorted Array many Repeating element

//	Arrays.sort(arr);
//	int i = 0, size1 = 0;
//	int[] result = new int[size];
//	for (int j = 0; j < arr.length - 1; j++) {
//		if (arr[j] == arr[j + 1]) {
//			result[i] = arr[j];
//			i++;
//			size1++;
//		}
//	}
//	result = Arrays.copyOf(result, size1);
	
	// 2 Repeating element Array without sorting
	int[] result = new int[2];
	int i = 0;
	boolean[] frequence = new boolean[6];
	for (int j : arr) {
		if (frequence[j - 1]) {
			result[i++] = j;
			if (i == 2) break;
		}
		frequence[j - 1] = true;
	}
	System.out.println(Arrays.toString(result));
}
}
