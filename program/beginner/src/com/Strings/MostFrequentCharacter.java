package com.Strings;

import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.Set;

public class MostFrequentCharacter {
public static void main(String[] args) {
	Scanner in = new Scanner(System.in);
	String str = in.nextLine();
	int[] feq = new int[256];
	int max = Integer.MIN_VALUE;
	for (char s : str.toCharArray()) {
		feq[s]++;
		if (feq[s] > max) {
			max = feq[s];
		}
	}
	Set<Character> res = new LinkedHashSet<>();
	for (char s : str.toCharArray()) {
		if (feq[s] == max) {
			res.add(s);
		}
		
	}
	System.out.println(max);
	System.out.println(res.toString());
}
}
