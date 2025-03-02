package com.Loops;

import java.util.Scanner;

public class DigitsCountLoop {
public static void main(String[] args) {
	Scanner in = new Scanner(System.in);
	long a = Math.abs(in.nextLong()), count = 0;
	do {
		count++;
		a /= 10;
	} while (a != 0);
	System.out.println(count);
}
}
