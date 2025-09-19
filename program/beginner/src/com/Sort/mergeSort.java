package com.Sort;

public class mergeSort {
    public void divide(int[] arr) {
        int n = arr.length;
        if (n < 2) return;
        int mid = arr.length / 2;
        int[] left = new int[mid];
        int[] rigth = new int[n - mid];

        for (int i = 0; i < mid; i++)
            left[i] = arr[i];
        for (int i = mid; i < n; i++)
            rigth[i - mid] = arr[i];

        divide(left);
        divide(rigth);
        merge(arr, left, rigth);
    }

    void merge(int[] arr, int[] left, int[] right) {
        int i = 0, j = 0, k = 0;

        while (i < left.length && j < right.length) {
            if (left[i] <= right[j])
                arr[k++] = left[i++];
            else
                arr[k++] = right[j++];
        }

        while (i < left.length)
            arr[k++] = left[i++];
        while (j < right.length)
            arr[k++] = right[j++];
    }
}
