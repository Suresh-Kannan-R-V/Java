package com.Strings;

import java.util.Scanner;

public class UpperCaseWord {
public static void main(String[] args) {
	Scanner in = new Scanner(System.in);
	String str = in.nextLine();
	StringBuilder res = new StringBuilder();
//	str.toLowerCase();
//	String[] S = str.split("\\s+");
//	for(String s:S){
//		res.append((Character.toUpperCase(s.charAt(0)))+ s.substring(1)).append(" ");
//	}
	for (int i = 0; i < str.length(); i++) {
		if (i==0|| str.charAt(i - 1) == ' ' && str.charAt(i) >= 'a') {
			res.append((char) (str.charAt(i) - 32));
		} else {
			res.append(str.charAt(i));
		}
	}
	str = res.toString();
	System.out.println(str);
}
}
