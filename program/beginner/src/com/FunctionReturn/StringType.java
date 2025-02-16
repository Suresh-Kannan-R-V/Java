package com.FunctionReturn;

import java.util.Scanner;

public class StringType {
public static void main(String[] args) {
	Scanner in = new Scanner(System.in);
	System.out.println(Char(in));
	System.out.println(StringType(in));
}

static char Char(Scanner in) {
	char number = in.next().charAt(0);
	return number;
}

static String StringType(Scanner in) {
	in.nextLine();
	String number1 = in.nextLine();
	return number1;
}
}
