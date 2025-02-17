/*Write a C program to input basic salary of an employee and calculate gross salary according to given conditions.
Basic Salary <= 10000 : HRA = 20%, DA = 80%
Basic Salary is between 10001 to 20000 : HRA = 25%, DA = 90%
Basic Salary >= 20001 : HRA = 30%, DA = 95%*/

package com.Maths;

import java.util.Scanner;

public class GrossSalary {
public static void main(String[] args) {
	Scanner in = new Scanner(System.in);
	int num = in.nextInt(), result = 0;
	if (num <= 10000) {
		result = (int) (num + (num * 0.2) + (num * 0.8));
	} else if (num > 10000 && num < 20000) {
		result = (int) (num + (num * 0.25) + (num * 0.9));
	} else {
		result = (int) (num + (num * 0.3) + (num * 0.95));
	}
	System.out.println((float) result);
}
}
