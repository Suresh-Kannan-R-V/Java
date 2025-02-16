package com.Scan;

import java.util.Scanner;

public class StringScan {
public static void main(String[] args) {
	Scanner in = new Scanner(System.in);
	int a = in.nextInt();
	in.nextLine(); //consume the leftover newline character (\n) from the previous nextInt() or nextFloat() call.
	String Str = in.nextLine();
	System.out.println(a);
	System.out.println(Str);
}
}
