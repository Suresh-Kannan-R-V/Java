package com.Training;
import java.util.*;
public class Demo {
public static void main(String[] args) {
	Scanner in = new Scanner(System.in);
	int a = in.nextInt(),i;
	int pow = (int)Math.pow(10,(int)Math.log10(a)),result = (a%10) *pow;
	for(i=a;i>10;i/=10);
	result+=a%pow;
	result-=a%10;
	result += i;
	System.out.println(result);
	}
}
