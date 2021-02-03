package com.company.james.arithmetic;

public class InsertSort extends Sort {
    public InsertSort(int[] array) {
        super(array);
    }

    @Override
    public void sort() {
        for (int i = 1; i < array.length; i++) {
            for (int j = i; j > 0; j--) {
                if (array[j - 1] > array[j]) {
                    swap(j - 1, j);
                }
            }
        }
    }


}
