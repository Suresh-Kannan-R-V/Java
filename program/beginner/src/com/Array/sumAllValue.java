package com.Array;

import java.util.Scanner;

public class sumAllValue {
public static void main(String[] args) {
	Scanner in = new Scanner(System.in);
	int size = in.nextInt(),sum=0;
	int[] arr = new int[size];
	for(int i=0;i<size;i++){
		arr[i] = in.nextInt();
		sum+=arr[i];
	}
	System.out.println(sum);
	
}
}
