package com.Maths;
import java.util.*;
public class FirstLastDigitSwap {
public static void main(String[] args) {
	Scanner in = new Scanner(System.in);
	int a = in.nextInt();
//	int last = a%10,pow = 1,temp = a,r;
//	while(temp>=10){
//		pow*=10;
//		temp/=10;
//	}
//	r = (a%pow)/10;
//	int result = last*pow + r*10 +temp;
	int pow = (int)Math.pow(10,(int)Math.log10(a)),result = (a%10) *pow,i;
	for(i=a;i>10;i/=10);
	result+=a%pow;
	result-=a%10;
	result += i;
	System.out.println(result);
}
}
