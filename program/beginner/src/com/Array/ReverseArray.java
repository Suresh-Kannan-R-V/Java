package com.Array;

import java.util.Arrays;
import java.util.Scanner;

public class ReverseArray {
public static void main(String[] args) {
	Scanner in = new Scanner(System.in);
	int size = in.nextInt();
	int[] arr = new int[size];
	for (int i = 0; i < size; i++) {
		arr[i] = in.nextInt();
	}
	int[] result = new int[arr.length];
	int k = 0;
	for(int i = arr.length-1;i>=0;i--){
		result[k]= arr[i];
		k++;
	}
	System.out.println(Arrays.toString(result));
}
}
