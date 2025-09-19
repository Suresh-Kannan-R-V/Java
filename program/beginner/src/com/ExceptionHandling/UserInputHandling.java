package com.ExceptionHandling;
import java.util.*;
import java.io.*;
public class UserInputHandling {
public static void main(String[] args) {
	Scanner in = new Scanner(System.in);
	PrintStream O = System.out;
	int a = in.nextInt(),b=in.nextInt();
	
	try{
		O.print(a/b);
	} catch (Exception e) {
		throw new RuntimeException(e);
	}
}
}
