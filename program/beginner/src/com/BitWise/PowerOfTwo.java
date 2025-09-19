package com.BitWise;
import java.util.*;
public class PowerOfTwo {
public static void main(String[] args) {
	Scanner in = new Scanner(System.in);
	int a=in.nextInt();
	if(a>0 && (a & (a-1)) == 0){
		System.out.println("It is Power of 2");
	}
	else{
		System.out.println("It is Not Power of 2");
	}
}
}
