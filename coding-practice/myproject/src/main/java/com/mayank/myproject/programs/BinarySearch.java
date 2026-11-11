package com.mayank.myproject.programs;

public class BinarySearch {

    public static int search(int[] arr, int key) {
        int low = 0;
        int high = arr.length - 1;

        while (high >= low) {
            int mid = (low + high) / 2;
            if (key == arr[mid])
                return mid;
            if (key > arr[mid])
                low = mid + 1;
            else
                high = mid - 1;
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] arr = {1, 10, 20, 47, 59, 65, 79, 88, 99};
        int key = 65;
        System.out.println(search(arr, key));
    }
}
