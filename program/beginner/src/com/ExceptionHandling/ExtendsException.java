package com.ExceptionHandling;

import java.util.Scanner;

public class ExtendsException {
public static void main(String[] args) {
	Scanner in = new Scanner(System.in);
	int a = in.nextInt();
	
	try {
//		new AgeValidator(a);
//		int mark = in.nextInt();
//		try{
//
//			new MarkValidate(mark);
//			System.out.println("Pass");
//		} catch (MarkValidate e) {
//			System.out.println(e.getMessage());
//		}
		new BalanceCheck(1000,a);
	} catch (BalanceCheck e) {
		System.out.println(e.getMessage());
	}
	finally {
		System.out.println("Thank You !...");
	}
}
}

class AgeValidator extends Exception {
public AgeValidator(int age) throws AgeValidator {
	if (age < 18) {
		throw new AgeValidator("Invalid: Age must be 18+");
	}
}

public AgeValidator(String message) {
	super(message);
}
}class MarkValidate extends Exception {
public MarkValidate(int mark) throws MarkValidate {
	if (mark < 40) {
		throw new MarkValidate("You should get at least 40 marks");
	}
}

public MarkValidate(String message) {
	super(message);
}
}


class BalanceCheck extends Exception {
BalanceCheck(int balance,int amount) throws BalanceCheck {
	if (amount > balance) {
		throw new BalanceCheck("Minimum Balance");
	}
}

BalanceCheck(String mes) {
	super(mes);
}
}

class MyException extends Exception{
MyException(String mes){
	super(mes);
}
}