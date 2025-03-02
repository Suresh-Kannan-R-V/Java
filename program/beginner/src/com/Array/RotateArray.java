package com.Array;

import java.util.Arrays;
import java.util.Scanner;

public class RotateArray {
public static void main(String[] args) {
	Scanner in = new Scanner(System.in);
	int size = in.nextInt();
	int[] arr = new int[size];
	for (int i = 0; i < size; i++) {
		arr[i] = in.nextInt();
	}
	int N = in.nextInt();
	int[] result = new int[arr.length];
	N = N % arr.length; // Handle cases where d > size (prevent extra rotations)
	//	int d = 7,size=5;
	//	d = 7 % 5 = 2;
	
	System.arraycopy(arr, N, result, 0, size - N);
	System.arraycopy(arr, 0, result, size - N, N);
	System.out.println(Arrays.toString(result));
}
}
