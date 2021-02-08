package com.company.james.arithmetic;

import java.util.Arrays;

public class JiShuSort extends Sort {
    public JiShuSort(int[] array) {
        super(array);
    }

    @Override
    public void sort() {
        int temp[] = new int[10];
        for (int i = 0; i < array.length; i++) {
            temp[array[i]]++;
        }
        int result[] = new int[array.length];
        int j = 0;
        for (int i = 0; i < temp.length; i++) {
            while (temp[i] > 0) {
                result[j++] = i;
                temp[i]--;
            }
        }
        System.out.println(Arrays.toString(result));
    }
}
