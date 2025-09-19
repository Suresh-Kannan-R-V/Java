package com.BitWise;
import java.util.*;

public class oddOrEven {
public static void main(String[] args) {
	Scanner in = new Scanner(System.in);
	int a=in.nextInt();
	if((a&1)==0){
		System.out.println("It is Even");
	}
	else{
		System.out.println("It is Odd");
	}
}
}
