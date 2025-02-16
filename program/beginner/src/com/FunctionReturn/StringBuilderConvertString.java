package com.FunctionReturn;

import java.util.Scanner;

public class StringBuilderConvertString {
public static void main(String[] args) {
	Scanner in = new Scanner(System.in);
	StringBuilder str = new StringBuilder("Suresh Kannan R V");
	System.out.println(charToString('S'));
	System.out.println(StringBuilderToString(str));
}

static String charToString(char S) {
	return String.valueOf(S);     //Recommended
//	return Character.toString(S);
}

static String StringBuilderToString(StringBuilder S) {
//	return String.valueOf(S);
	return S.toString();    //Recommended
}
}
