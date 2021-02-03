package com.company.james.arithmetic;

public class ShellSort extends Sort {
    public ShellSort(int[] array) {
        super(array);
    }

    @Override
    public void sort() {
        int N = array.length;
        for (int gap = N / 2; gap > 0; gap /= 2) {
            for (int i = gap; i < N; i++) {
                for (int j = i; j > 0; j--) {
                    if (array[j - 1] > array[j]) {
                        swap(j - 1, j);
                    }
                }
            }
        }
    }
}
