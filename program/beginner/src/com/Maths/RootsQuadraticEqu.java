package com.Maths;

import java.util.Scanner;

public class RootsQuadraticEqu {
public static void main(String[] args) {
	Scanner in = new Scanner(System.in);
	int a = in.nextInt(), b = in.nextInt(), c = in.nextInt();
	int del = (int) Math.pow(b, 2) - (4 * a * c);
	if (del < 0) {
		del *= -1;
	}
	float root1 = (float) ((-1 * b) - Math.sqrt(del)) / (2 * a);
	float root2 = (float) ((-1 * b) + Math.sqrt(del)) / (2 * a);
	System.out.printf("Root1 : %.2f\n", root1);
	System.out.printf("Root2 : %.2f\n", root2);
	System.out.println("USING FORMAT METHOD");
	System.out.println("Root1 : " + String.format("%.2f", root1));
	System.out.println("Root2 : " + String.format("%.2f", root2));
}
}
