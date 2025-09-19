package com.Sort;

import java.util.Arrays;

public class cyclicSort {
    //You have an array of size n.
    //The numbers are in the range 1 to n (no duplicates, each appears once).

    public static void main(String[] args) {
        int[] arr = {5, 4, 3, 1, 2};
        cyclicsort(arr);
        System.out.println(Arrays.toString(arr));
    }

    public static void cyclicsort(int[] arr) {
        int ind = 0;
        while (ind < arr.length) {
            int correct = arr[ind] - 1;
            if (arr[ind] != arr[correct]) {
//                int temp = arr[ind];
//                arr[ind] = arr[correct];
//                arr[correct] = temp;

                // other way to swap without temp
                arr[correct] = arr[ind] + (arr[ind] = arr[correct]) * 0;
            } else {
                ind++;
            }
        }
    }
}
