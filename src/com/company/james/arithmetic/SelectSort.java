package com.company.james.arithmetic;

public class SelectSort extends Sort {

    public SelectSort(int[] array) {
        super(array);
    }

    public void sort() {

        for (int i = 0; i < array.length - 1; i++) {
            int minPosition = i;
            for (int j = i + 1; j < array.length; j++) {
                if (array[minPosition] > array[j]) {
                    minPosition = j;
                }
            }
            swap(i, minPosition);
        }

    }
}
