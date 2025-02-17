package com.Maths;

import java.util.Scanner;

public class MinCount {
public static void main(String[] args) {
	Scanner in = new Scanner(System.in);
	int a = in.nextInt(), b = in.nextInt(), c = in.nextInt(), d = in.nextInt();
	int max, count = 0;
	if (a > b && a > c && a > d) {
		max = a;
	} else if (b > c && b > d) {
		max = b;
	} else if (c > d) {
		max = c;
	} else {
		max = d;
	}
	if (a < max) {
		count++;
	}
	if (b < max) {
		count++;
	}
	if (c < max) {
		count++;
	}
	if (d < max) {
		count++;
	}
	System.out.println(count);
}
}
