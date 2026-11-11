package com.mayank.myproject.programming;

public class MaxDiff {
    public static void main(String[] args) {
        int[] arr = {2, 3, 10, 6, 4, 8, 1};
        System.out.println(getMaxDiff(arr));
    }

    static int getMaxDiff(int[] arr) {
        int maxDiff = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                maxDiff = arr[i] - arr[j];
            }
        }
        return maxDiff;
    }
}
