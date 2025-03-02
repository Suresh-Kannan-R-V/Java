package com.Maths;

import java.util.Scanner;

public class DigitsCountNoLoop {
public static void main(String[] args) {
	Scanner in = new Scanner(System.in);
	long num = in.nextLong();
	int count = (int) Math.log10(num) + 1;
//	int count = String.valueOf(num).length();
	System.out.println(count);
}
}
