package com.company.james.arithmetic;

import java.util.Arrays;

public class MergerSort extends Sort {
    private int temp[];

    public MergerSort(int[] array) {
        super(array);
        temp = new int[array.length];
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

    public void sort2(int middle, int left, int right, int k) {
        if (left <= middle && right < array.length) {
            temp[k++] = array[left] < array[right] ? array[left++] : array[right++];
            sort2(middle, left, right, k);
        } else {
            while (left <= middle) {
                temp[k++] = array[left++];
            }
            while (right < array.length) {
                temp[k++] = array[right++];
            }
            System.out.println(Arrays.toString(temp));
        }
    }
}
