package com.Array;

import java.util.Scanner;

public class FirstLastOccur {
public static void main(String[] args) {
	Scanner in = new Scanner(System.in);
	int size = in.nextInt();
	int[] arr = new int[size];
	for (int i = 0; i < size; i++) {
		arr[i] = in.nextInt();
	}
	int x = in.nextInt();
	int f = -1,l=-1;
	for(int i=0;i<arr.length;i++){
		if(arr[i]==x&&f==-1){
			f=i;
			l=i;
		}
		if(arr[i]==x){
			l=i;
		}
	}
}
}
