package com.FunctionReturn;

import java.util.Scanner;

public class ObjectConvertString {
public static void main(String[] args) {
	Scanner in = new Scanner(System.in);
	System.out.println(objectToString(new ObjectConvertString()));
}

static String objectToString(Object obj) {
//	return String.valueOf(obj);     //Recommended (Handles null safely)
	return obj.toString();      // Will throw NullPointerException if obj is null
}
}
