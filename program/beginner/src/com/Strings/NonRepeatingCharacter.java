package com.Strings;

import java.util.Scanner;

public class NonRepeatingCharacter {
public static void main(String[] args) {
	Scanner in = new Scanner(System.in);
	String str = in.nextLine();
	int[] feq = new int[256];
	for(char s :str.toCharArray()){
		feq[s]++;
	}
	for(char s :str.toCharArray()){
		if(feq[s] == 1){
			System.out.println(s);
			break;
		}
	}
	}
}
