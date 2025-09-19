package com.Strings;

import java.util.Scanner;

public class RemoveSpaces {
public static void main(String[] args) {
	Scanner in = new Scanner(System.in);
	String str = in.nextLine();
//	StringBuilder result = new StringBuilder();
//	for (char s : str.toCharArray()) {
//		if (!(s == ' ')) {
//			result.append(s);
//		}
//	}
//	str = result.toString();
	str = str.replaceAll("\\s+","");
	System.out.println(str);
}
}
