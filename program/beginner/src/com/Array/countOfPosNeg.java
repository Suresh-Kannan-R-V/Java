package com.Array;

import java.util.Scanner;

public class countOfPosNeg {
public static void main(String[] args) {
	Scanner in = new Scanner(System.in);
	int size = in.nextInt(), pos = 0, neg = 0;
	int[] arr = new int[size];
	for (int i = 0; i < size; i++) {
		arr[i] = in.nextInt();
		if (arr[i] < 0) {
			neg++;
		} else {
			pos++;
		}
	}
	System.out.println("Positive : " + pos);
	System.out.println("Negative : " + neg);
}
}
