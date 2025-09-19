package com.Strings;

import java.util.Scanner;

public class ReciprocalOfLetters {
public static void main(String[] args) {
	Scanner in = new Scanner(System.in);
	String str = in.nextLine();
	StringBuilder result = new StringBuilder();
	
	for (char s : str.toCharArray()) {
		if (s >= 'A' && s <= 'Z') {
			result.append((char) (155 - s));
		} else if (s >= 'a' && s <= 'z') {
			result.append((char) (219 - s));
		} else {
			result.append(s);
		}
	}
	System.out.println(result.toString());
}
}
