package com.Array;

import java.util.*;

public class ReadAndPrint {
public static void main(String[] args) {
	Scanner in = new Scanner(System.in);
	int size = in.nextInt();
	int[] arr = new int[size];
	for(int i=0;i<size;i++){
		arr[i] = in.nextInt();
	}
	System.out.println(Arrays.toString(arr));
}
}
