package com.company.james.arithmetic;

public class QuickSort extends Sort {
    public QuickSort(int[] array) {
        super(array);
    }

    public void quickSort(int leftBound, int rightBound) {
        if (leftBound < rightBound) {
            int left = leftBound;
            int right = rightBound;
            int provid = array[leftBound];
            while (left < right) {
                while (left < right && array[right] > provid) {
                    right--;
                }
                if (left < right) {
                    array[left] = array[right];
                    left++;
                }
                while (left < right && array[left] < provid) {
                    left++;
                }
                if (left < right) {
                    array[right] = array[left];
                    right--;
                }
            }
            array[left] = provid;
            quickSort(leftBound, left - 1);
            quickSort(left + 1, rightBound);
        }
    }


    @Override
    public void sort() {
    }
}
