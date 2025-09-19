package com.BitWise;

import java.util.Scanner;

public class NumberOfBitON {
public static void main(String[] args) {
	Scanner in = new Scanner(System.in);
	int a = in.nextInt(), count = 0;
	while (a != 0) {
		a = a & (a - 1);
		count++;
	}
	System.out.println("Number of Bits Are ON (1) :" + count);
}
}
