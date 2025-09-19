package com.Array;

public class SplitArrayLargestSum {
    public static void main(String[] args) {
        SplitArrayLargestSum ob = new SplitArrayLargestSum();
        int[] arr = {7, 2, 5, 10, 8};
        int k = 2;
        ob.splitArray(arr, k);

    }

    public int splitArray(int[] nums, int k) {
        int n = nums.length;
        int start = nums[0], end = nums[0];
        for (int i = 1; i < n; i++) {
            start = Math.max(start, nums[i]);    //find the Max element to keep it as (Min Answer possible)
            end += nums[i];   //sum the all values of array to keep it as (Max Answer possible)
        }
        System.out.println(start);
        System.out.println(end);


        //Binary Search Approach
        while (start < end) {
            //mid is my possible answer in the case searching
            int mid = start + (end - start) / 2;

            //calculate the number of pieces can be able to divide this with max sum
            int sum = 0;
            int pieces = 1;
            for (int num : nums) {
                if (sum + num > mid) {
                    sum = 0 ;
                    pieces++;
                }
                sum += num;

            }

            if (pieces > k) {
                start = mid + 1;
            } else if (pieces <= k) {
                end = mid;
            }

        }
        System.out.println(start);

        return start;   //return start or end as well because start == end after all iteration
    }
}
