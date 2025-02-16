package com.Scan;

import java.util.Scanner;

public class Scan {
public static void main(String[] args) {
	Scanner Integerin = new Scanner(System.in);
	Scanner Floatin = new Scanner(System.in);
	Scanner Stringin = new Scanner(System.in);
	boolean bool = Integerin.nextBoolean();
	byte Byte = Integerin.nextByte();
	int number = Integerin.nextInt();
	short number1 = Integerin.nextShort();
	long number2 = Integerin.nextLong();
	float float1 = Floatin.nextFloat();
	double double1 = Floatin.nextDouble();
	char str = Stringin.next().charAt(0);
	Stringin.nextLine();
	String Str1 = Stringin.nextLine();
	System.out.println(bool);
	System.out.println(Byte);
	System.out.println(number);
	System.out.println(number1);
	System.out.println(number2);
	System.out.println(float1);
	System.out.println(double1);
	System.out.println(str);
	System.out.println(Str1);
}
}
