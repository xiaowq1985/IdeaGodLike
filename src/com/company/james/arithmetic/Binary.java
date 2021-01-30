package com.company.james.arithmetic;

public class Binary {
    public static int recursionBinarySearch(int[] arr, int key, int low, int high) {
        if (key < arr[low] || key > arr[high] || low > high) {
            return -1;
        }
        int middle = (low + high) / 2;
        if (key < arr[middle]) {
            return recursionBinarySearch(arr, key, low, middle - 1);
        } else if (key > arr[middle]) {
            return recursionBinarySearch(arr, key, middle + 1, high);
        } else {
            return middle;
        }
    }

    public static int commonBinarySearch(int[] arr, int key) {
        int low = 0;
        int high = arr.length - 1;
        int middle;
        while (true) {
            if (key < arr[low] || key > arr[high] || low > high) {
                return -1;
            }
            middle = (low + high) / 2;
            if (key > arr[middle]) {
                low = middle + 1;
            } else if (key < arr[middle]) {
                high = middle - 1;
            } else {
                return middle;
            }
        }
    }


}
