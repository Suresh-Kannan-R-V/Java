package com.Scan;

import java.util.Scanner;

public class BigScan {
public static void main(String[] args) {
	Scanner in = new Scanner(System.in);
	java.math.BigInteger Value = in.nextBigInteger();
	java.math.BigDecimal Value1 = in.nextBigDecimal();
	System.out.println(Value);
	System.out.println(Value1);
	System.out.println(String.valueOf(Value));
	System.out.println(String.valueOf(Value1));
	System.out.println(Value.toString());
	System.out.println(Value1.toString());
}
}
