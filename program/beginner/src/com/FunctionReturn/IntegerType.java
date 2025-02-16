package com.FunctionReturn;

import java.util.Scanner;

public class IntegerType {
public static void main(String[] args) {
	Scanner in = new Scanner(System.in);
	System.out.println(Byte(in));
	System.out.println(Int(in));
	System.out.println(Short(in));
	System.out.println(Long(in));
}

static byte Byte(Scanner in) {
	byte number = in.nextByte();
	return number;
}

static int Int(Scanner in) {
	int number1 = in.nextInt();
	return number1;
}

static short Short(Scanner in) {
	short number2 = in.nextShort();
	return number2;
}

static long Long(Scanner in) {
	long number3 = in.nextLong();
	return number3;
}
}
