package com.Array;

public class NumberOfRotation {
    public static void main(String[] args) {
        int[] arr = {15, 18, 2, 3, 4, 5, 14};
        int rotate = Rotation(arr);
    }

    public static int Rotation(int[] arr) {
        int s = 0, e = arr.length - 1;
        while (s <= e) {
            int mid = s + (e - s) / 2;
            if (arr[s] < arr[mid]) {
                s = mid;
            } else if (arr[s] >= arr[mid]) {
                e = mid - 1;
            }
        }
        return s;
    }
}
