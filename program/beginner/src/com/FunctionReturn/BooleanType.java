package com.FunctionReturn;
import java.util.Scanner;

public class BooleanType {
public static void main(String[] args) {
	Scanner in = new Scanner(System.in);
	int a = in.nextInt();
	System.out.println(BoolType(a));
}
static boolean BoolType(int a){
	if(a%2==0)
		return true;
	else
		return false;
}
}
