package com.Strings;

import java.util.Scanner;

public class RemoveCharactersString {
public static void main(String[] args) {
	Scanner in = new Scanner(System.in);
	String str = in.nextLine();
	StringBuilder result = new StringBuilder();
	for (char s : str.toCharArray()) {
		if (!(s >= 'a' && s <= 'z' || s >= 'A' && s <= 'Z')) {
			result.append(s);
		}
	}
	str = result.toString();
	System.out.println(str);
}
}
