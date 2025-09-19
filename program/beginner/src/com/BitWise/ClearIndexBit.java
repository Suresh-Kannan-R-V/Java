package com.BitWise;

import java.util.Scanner;

public class ClearIndexBit {
public static void main(String[] args) {
	Scanner in = new Scanner(System.in);
	int a = in.nextInt();
	int ind = in.nextInt();
	
	System.out.println(a - (1<<ind)); //
	//             (or)
	System.out.println(a ^ (1<<ind)); // toggle the bit
}
}
