package com.FunctionReturn;

import java.util.Scanner;

public class PairType {
public static void main(String[] args) {
	Scanner in = new Scanner(System.in);
	int size = in.nextInt();
	int[] arr = new int[size];
	for (int i = 0; i < size; i++) {
		arr[i] = in.nextInt();
	}
	Pair<Integer, Integer> result = MinMax(arr);
	System.out.println(result.first + " " + result.second);
}

static Pair<Integer, Integer> MinMax(int[] arr) {
	int max = arr[0], min = arr[0];
	for (int i : arr) {
		if (i > max) {
			max = i;
		}
		if (i < min) {
			min = i;
		}
	}
	return new Pair<>(min, max);
}
}

class Pair<U, V> {
public final U first;
public final V second;

public Pair(U first, V second) {
	this.first = first;
	this.second = second;
}
}
