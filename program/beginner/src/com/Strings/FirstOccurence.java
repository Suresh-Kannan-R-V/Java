package com.Strings;

import java.util.Scanner;

public class FirstOccurence {
public static void main(String[] args) {
	Scanner in = new Scanner(System.in);
	String str = in.nextLine();
	String txt = in.nextLine();
	int result = str.indexOf(txt);
	System.out.println(result);
}
}
