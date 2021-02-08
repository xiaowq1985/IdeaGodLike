package com.company.james.arithmetic;

public class BubbleSort extends Sort {
    public BubbleSort(int[] array) {
        super(array);
    }

    @Override
    public void sort() {
        for (int i = 0; i < array.length - 1; i++) {
            for (int j = 0; j < array.length - 1 - i; j++) {
                if (isBig(j, j + 1)) {
                    swap(j, j + 1);
                }
            }
        }
    }
}
