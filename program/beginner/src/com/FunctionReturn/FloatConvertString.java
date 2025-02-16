package com.FunctionReturn;

import java.util.Scanner;

public class FloatConvertString {
public static void main(String[] args) {
	Scanner in = new Scanner(System.in);
	System.out.println(floatToString(10.123456f));
	System.out.println(doubleToString(100.1234567890d));
}

static String floatToString(float num) {
	return String.valueOf(num);     //Recommended
//	return Float.toString(num);
}

static String doubleToString(double num) {
	return String.valueOf(num);     //Recommended
//	return Double.toString(num);
}
}
