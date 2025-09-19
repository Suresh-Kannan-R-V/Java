package com.Strings;

import java.util.Scanner;

public class ReverseWord {
public static void main(String[] args) {
	Scanner in = new Scanner(System.in);
	String str = in.nextLine();
	String[] seperate = str.split("\\s+");
	StringBuilder result = new StringBuilder();
	for (int i = seperate.length - 1; i >= 0; i--) {
		result.append(seperate[i]).append(" ");
	}
	str = result.toString().trim();
	System.out.println(str);
}
}
