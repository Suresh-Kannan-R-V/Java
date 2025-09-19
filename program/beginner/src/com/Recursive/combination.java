package com.Recursive;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class combination {
static int[][] combinationArr;
static Map<String, Integer> combinationMap = new HashMap<>();

public static void main(String[] args) {
	Scanner in = new Scanner(System.in);
	int n = in.nextInt();
	int r = in.nextInt();
	combinationArr = new int[n + 1][r + 1];
	System.out.println(combinationArray(n, r));
	System.out.println(combinationUsingMap(n, r));
}

public static int combinationArray(int n, int r) {
	if (r == n || r == 0) return 1;
	if (combinationArr[n][r] != 0) return combinationArr[n][r];
	return combinationArr[n][r] = combinationArray(n - 1, r - 1) + combinationArray(n - 1, r);
}

public static int combinationUsingMap(int n, int r) {
	if (r == 0 || n == r) return 1;
	String Key = n + " " + r;
	if (combinationMap.containsKey(Key)) {
		return combinationMap.get(Key);
	}
	Integer result = combinationUsingMap(n - 1, r - 1) + combinationUsingMap(n - 1, r);
	combinationMap.put(Key, result);
	return result;
}
}
