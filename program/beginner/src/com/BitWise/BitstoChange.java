package com.BitWise;

import java.util.Scanner;

public class BitstoChange {
public static void main(String[] args) {
	Scanner in = new Scanner(System.in);
	int a = in.nextInt(), b = in.nextInt(), count = 0;
	a = a ^ b;
	while (a != 0) {
		a = a & (a - 1);
		count++;
	}
	System.out.println("Number oof Bits too Change : " + count);
}
}

//10-> 1010 -> 2 digits are differ from 5
//5 -> 0101 -> 2 digits are differ from 10
//--------------------------------------------
//12-> 1100 -> 3 digits are differ from 7
//7 -> 0111 -> 3 digits are differ from 12


