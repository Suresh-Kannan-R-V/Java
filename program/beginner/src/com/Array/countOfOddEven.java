package com.Array;

import java.util.Scanner;

public class countOfOddEven {
public static void main(String[] args) {
	Scanner in = new Scanner(System.in);
	int size = in.nextInt(), odd = 0, even = 0;
	int[] arr = new int[size];
	for (int i = 0; i < size; i++) {
		arr[i] = in.nextInt();
		if (arr[i] % 2 == 0) {
			even++;
		} else {
			odd++;
		}
	}
	System.out.println("odd :" + odd);
	System.out.println("even :" + even);
}
}
