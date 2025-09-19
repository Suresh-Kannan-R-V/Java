package com.Maths;

import java.util.Scanner;

public class OddOrEven {
public static void main(String[] args) {
	Scanner in = new Scanner(System.in);
	int num = in.nextInt();
	System.out.println(num%2==0? "It is Even." : "It is Odd.");
}
}