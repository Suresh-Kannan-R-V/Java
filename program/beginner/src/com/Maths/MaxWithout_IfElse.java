package com.Maths;

import java.util.Scanner;

//If a > b, (a - b) is positive.
//If a < b, (a - b) is negative.

// (a + b + (a - b)) / 2 = (2a) / 2 = a ✅
// (a + b + (b - a)) / 2 = (2b) / 2 = b ✅

// Math.abs(a - b) = a - b
// Math.abs(a - b) = b - a

public class MaxWithout_IfElse {
public static void main(String[] args) {
	Scanner in = new Scanner(System.in);
	int a = in.nextInt();
	int b = in.nextInt();
	int Max = (a + b + Math.abs(a - b)) / 2;
	System.out.println(Max);
}
}
