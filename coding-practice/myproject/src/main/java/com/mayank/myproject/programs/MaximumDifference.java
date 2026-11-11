package com.mayank.myproject.programs;

public class MaximumDifference {

    public static void main(String[] args) {
        System.out.println("started");

        int[] arr = { 47, 56, 3, 42, 4, 6, 7, 8, 9, 10, 34, 45, 38, 43 };

        int min = arr[0];
        int max = arr[0];
        for (int i=0; i<arr.length; i++) {
            if (max < arr[i]) {
                max = arr[i];
            }
            if (min > arr[i]) {
                min = arr[i];
            }
        }
        System.out.println("Min: "+min+" Max: "+max);
        System.out.println("MaximumDifference: "+ (max - min));

        int stMin = arr[0];
        int stMax = 0;
        int minIndex = 0;
        for (int i=0; i<arr.length; i++) {
            if (stMin > arr[i]) {
                stMin = arr[i];
                minIndex = i;
            }
        }
        for (int i=minIndex; i<arr.length; i++) {
            if (stMax < arr[i]) {
                stMax = arr[i];
            }

        }
        System.out.println("Min: "+stMin+" Max: "+stMax);
        System.out.println("Stock MaximumDifference: "+ (stMax - stMin));

    }
}
