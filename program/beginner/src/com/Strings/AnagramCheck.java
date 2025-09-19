package com.Strings;

import java.util.Arrays;
import java.util.Scanner;

public class AnagramCheck {
public static void main(String[] args) {
	Scanner in = new Scanner(System.in);
	String str1 = in.nextLine();
	String str2 = in.nextLine();
	int[] feq1 = new int[256];
	int[] feq2 = new int[256];
	for (char s : str1.toCharArray()) {
		feq1[s]++;
	}
	for (char s : str2.toCharArray()) {
		feq2[s]++;
	}
	System.out.println(Arrays.equals(feq1, feq2) ? "It is Anagram" : "It is Not Anagram");
}
}
