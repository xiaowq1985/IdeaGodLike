package com.company.james.arithmetic;

import java.util.Arrays;

public class MergerSort extends Sort {
    public MergerSort(int[] array) {
        super(array);
    }

    @Override
    public void sort() {
        int middle = array.length / 2;
        int i = 0, k = 0;
        int j = middle + 1;
        int temp[] = new int[array.length];
        while (i <= middle && j < array.length) {
            temp[k++] = array[i] <= array[j] ? array[i++] : array[j++];
        }
        while (i <= middle)
            temp[k++] = array[i++];
        while (j < array.length)
            temp[k++] = array[j++];
        System.out.println(Arrays.toString(temp));
    }
}
