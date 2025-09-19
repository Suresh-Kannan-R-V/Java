package com.Recursive;

import java.util.Scanner;

public class reverseNumber {
public static void main(String[] args) {
	Scanner in = new Scanner(System.in);
	int a = in.nextInt();
	System.out.println(reverseNumbers(a,0));
}
public static int reverseNumbers(int n,int result){
	if(n == 0) return result;
	return reverseNumbers(n/10,result*10 + n%10);
}
}
