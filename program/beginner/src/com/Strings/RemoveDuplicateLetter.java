package com.Strings;

import java.util.Scanner;

public class RemoveDuplicateLetter {
public static void main(String[] args) {
	Scanner in = new Scanner(System.in);
	String str = in.nextLine();
	StringBuilder result = new StringBuilder();
	boolean[] check = new boolean[256];
//	Set<Character> res = new LinkedHashSet<>();
	for (char s : str.toCharArray()) {
		if (!check[s]) {
			result.append(s);
			check[s] = true;
		}
	}
//	for (char s : str.toCharArray()) {
//		res.add(s);
//	}
//	for (char s : res) {
//		result.append(s);
//	}
	str = result.toString();
	System.out.println(str);
}
}
