package com.Sort;

import java.util.Arrays;

public class insertion {
    public static void main(String[] args) {
        int[] arr = {5,4,-3,2,1};
        insertionSort(arr);
        System.out.println(Arrays.toString(arr));
    }
    public static void insertionSort(int[] arr) {
        int n = arr.length;

        for (int i = 0; i < n-1; i++) {
            int j = i+1;
            while (j > 0 && arr[j-1] > arr[j]) {
                int temp = arr[j - 1];
                arr[j - 1] = arr[j];
                arr[j] = temp;
                j--;
            }
        }
    }
}
