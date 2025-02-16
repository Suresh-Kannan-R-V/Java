package com.Maths;
import java.util.*;

public class HrsMinCal {
public static void main(String[] args) {
	Scanner in = new Scanner(System.in);
	int a = in.nextInt(),b=in.nextInt(),c=in.nextInt(),d=in.nextInt();
	int num1 = (a*100)+b;
	int num2 = (c*100)+d;
	int result = num1>num2 ? num1-num2 : num2-num1;
	System.out.println((int)result/100 + " Hours "+ result%100 + " Minutes");
}
}
