package com.FunctionReturn;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Scanner;

public class BigType {
public static void main(String[] args) {
	Scanner in = new Scanner(System.in);
	System.out.println(BigInt(in));
	System.out.println(BigDec(in));
}

static BigInteger BigInt(Scanner in) {
	BigInteger value = in.nextBigInteger();
	return value;
}

static BigDecimal BigDec(Scanner in) {
	BigDecimal value = in.nextBigDecimal();
	return value;
}
}
