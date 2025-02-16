package com.FunctionReturn;

import java.util.Scanner;

public class IntConvertString {
public static void main(String[] args) {
	Scanner in = new Scanner(System.in);
	System.out.println(byteToString((byte) 1));
	System.out.println(intToString(100));
	System.out.println(shortToString((short) 1000));
	System.out.println(longToString(10000L));
}

static String byteToString(byte num) {
	return String.valueOf(num);     //Recommended
//	return Byte.toString(num);
}

static String intToString(int num) {
	return String.valueOf(num);     //Recommended
//	return Integer.toString(num);
}

static String shortToString(short num) {
	return String.valueOf(num);     //Recommended
//	return Short.toString(num);
}

static String longToString(long num) {
	return String.valueOf(num);     //Recommended
//	return Long.toString(num);
}
}
