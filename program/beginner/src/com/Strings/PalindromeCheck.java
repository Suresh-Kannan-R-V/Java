package com.Strings;

import java.util.Scanner;

public class PalindromeCheck {
public static void main(String[] args) {
	Scanner in = new Scanner(System.in);
	String str = in.nextLine();
	StringBuilder check = new StringBuilder(str);
	System.out.println(str.equals(check.reverse().toString()) ? "It is a Palindrome" :"It is Not a Palindrome");
}
}
