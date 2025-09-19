package com.Strings;

import java.math.BigInteger;
import java.util.Scanner;

public class MultiplyTwoStrings {
public static void main(String[] args) {
	Scanner in = new Scanner(System.in);
	String str1 = in.nextLine();
	String str2 = in.nextLine();
	BigInteger s1 = new BigInteger(str1);
	BigInteger s2 = new BigInteger(str2);
	String result = s1.multiply(s2).toString();
	System.out.println(result);
}
}
