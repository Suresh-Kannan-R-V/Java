package com.Strings;

import java.util.Scanner;

public class ValidSubstringBrackets {
public static void main(String[] args) {
	Scanner in = new Scanner(System.in);
	String str = in.nextLine();
	long[] result = new long[2];
	for (char s : str.toCharArray()) {
		if (s == '(') {
			result[0]++;
		} else if (s == ')') {
			result[1]++;
		}
	}
	if(result[0]%2!=0){
		result[0]-=1;
	}if(result[1]%2!=0){
		result[1]-=1;
	}
	long sum = result[0] + result[1];
	System.out.println(sum);
}
}
