package com.Convert;

import java.util.Scanner;

public class StringConvertTypes {
public static void main(String[] args) {
	Scanner in = new Scanner(System.in);
	String BoolI = in.nextLine();
	String ByteI = in.nextLine();
	String IntI = in.nextLine();
	String ShortI = in.nextLine();
	String LongI = in.nextLine();
	String FloatI = in.nextLine();
	String DoubleI = in.nextLine();
	
	boolean boolValue = Boolean.parseBoolean(BoolI);
	byte byteValue = Byte.parseByte(ByteI);
	int intValue = Integer.parseInt(IntI);
	short shortValue = Short.parseShort(ShortI);
	long longValue = Long.parseLong(LongI);
	float floatValue = Float.parseFloat(FloatI);
	double doubleValue = Double.parseDouble(DoubleI);
	
	System.out.println("Boolean: " + boolValue);
	System.out.println("Byte: " + byteValue);
	System.out.println("Int: " + intValue);
	System.out.println("Short: " + shortValue);
	System.out.println("Long: " + longValue);
	System.out.println("Float: " + floatValue);
	System.out.println("Double: " + doubleValue);}
}
