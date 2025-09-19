package com.BitWise;

import java.util.Scanner;

public class decimaltoBinary {
public static void main(String[] args) {
	Scanner in = new Scanner(System.in);
	int a = in.nextInt();
	StringBuilder result = new StringBuilder();
	System.out.println("How many bits you want:");
	int bit = in.nextInt();
	for (int i = 0; i < bit; i++) {
		if ((a & (1 << i)) > 0) {
			result.insert(0, '1');
		} else {
			result.insert(0, '0');
		}
	}
	System.out.println(result.toString());
}
}
