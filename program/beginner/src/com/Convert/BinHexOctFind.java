package com.Convert;
import java.util.Scanner;

public class BinHexOctFind {
public static void main(String[] args) {
	Scanner in = new Scanner(System.in);
	int num = in.nextInt();
	String BINARY = Integer.toBinaryString(num);
	String HEX = Integer.toHexString(num).toUpperCase();
	String OCT = Integer.toOctalString(num);
	System.out.println("0b" + Integer.parseInt(BINARY));
	System.out.println("0x" + HEX);
	System.out.println('0' + Integer.parseInt(OCT));
}
}
