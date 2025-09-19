package com.BitWise;
import java.util.*;

public class addOneToNumber {
public static void main(String[] args) {
	Scanner in = new Scanner(System.in);
	int a = in.nextInt();
	int result = ~(+a); // Increment a++
//	int result = ~(-a); // Decrement a--
	System.out.println(Math.abs(result));
}
}
