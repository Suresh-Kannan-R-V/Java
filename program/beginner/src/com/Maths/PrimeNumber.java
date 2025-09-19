package com.Maths;
import java.util.*;

public class PrimeNumber {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int a = in.nextInt();
		System.out.println(isPrime(a)?"Prime":"Not Prime");
	}

	public static boolean isPrime(int a) {
		if(a<=1) return false;
		for(int i = 2;i*i<=a;i++){
			if(a%i==0) return false;
		}
		return true;
	}
}
