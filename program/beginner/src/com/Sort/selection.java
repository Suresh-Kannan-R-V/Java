package com.Sort;

import java.util.Arrays;

public class selection {
    public static void main(String[] args) {
        int[] arr = {5,4,3,2,1};
        selectionSort(arr);
        System.out.println(Arrays.toString(arr));
    }

    public static void selectionSort(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            int last = arr.length - i - 1;
            int max = 0;
            for (int j = 0; j <= last; j++) {
                if (arr[j] > arr[max]) {
                    max = j;
                }
            }

            int temp = arr[max];
            arr[max] = arr[last];
            arr[last] = temp;
        }

    }
}
