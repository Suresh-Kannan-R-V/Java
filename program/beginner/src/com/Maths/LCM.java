package com.Maths;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class LCM {
public static void main(String[] args) {
	Scanner in = new Scanner(System.in);
	int num1 = in.nextInt();
	int num2 = in.nextInt();
	System.out.println(isGCD(num1, num2));
}

static List<Integer> isGCD(int a, int b) {
	int gcd = 1;
	List<Integer> Result = new ArrayList<>();
	for (int i = 2; i <= (a < b ? a : b); i++) {
		if (a % i == 0 && b % i == 0) {
			gcd = i;
		}
	}
	int lcm = (a * b) / gcd;
	Result.add(lcm);
	Result.add(gcd);
	return Result;
}
}
