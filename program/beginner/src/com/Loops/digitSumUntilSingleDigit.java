package com.Loops;
import java.util.*;

public class digitSumUntilSingleDigit {
public static void main(String[] args) {
	Scanner in = new Scanner(System.in);
	int a = in.nextInt();
	for(;a>=10;){
		int s = 0;
		for(int i = a;i>0;i/=10){
			s +=i%10;
		}
		a = s;
	}
	System.out.println(a);
}
}
