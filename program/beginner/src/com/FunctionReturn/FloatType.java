package com.FunctionReturn;

import java.util.Scanner;

public class FloatType {
public static void main(String[] args) {
	
	Scanner in = new Scanner(System.in);
	System.out.println(Floatfun(in));
	System.out.println(Doublefun(in));
}

static float Floatfun(Scanner in) {
	float number = in.nextFloat();
	return number;
}

static double Doublefun(Scanner in) {
	double number1 = in.nextDouble();
	return number1;
}
}
