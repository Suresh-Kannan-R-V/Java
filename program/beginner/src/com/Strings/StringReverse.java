package com.Strings;

import java.util.Scanner;

public class StringReverse {
public static void main(String[] args) {
	Scanner in = new Scanner(System.in);
	String str = in.nextLine();
	StringBuilder result = new StringBuilder(str);
	str = result.reverse().toString();
	System.out.println(str);
}
}
