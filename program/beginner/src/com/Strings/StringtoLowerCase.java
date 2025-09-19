package com.Strings;

import java.util.Scanner;

public class StringtoLowerCase {
public static void main(String[] args) {
	Scanner in = new Scanner(System.in);
	String str = in.nextLine();
	StringBuilder res = new StringBuilder();
	for (char s : str.toCharArray()) {
		if (s >= 'A' && s <= 'Z') {
			res.append((char) (s + 32));
		} else {
			res.append(s);
		}
	}
	str = res.toString();
	System.out.println(str);
}
}
