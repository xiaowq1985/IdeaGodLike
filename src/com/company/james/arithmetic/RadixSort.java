package com.company.james.arithmetic;

import java.util.ArrayList;
import java.util.List;

public class RadixSort extends Sort {
    private List<Integer> integerList[];

    public RadixSort(int[] array) {
        super(array);
        integerList = new ArrayList[10];
        for (int i = 0; i < integerList.length; i++) {
            integerList[i] = new ArrayList<>();
        }
    }

    @Override
    public void sort() {
        int maxPos = 0;
        for (int i = 1; i < array.length; i++) {
            if (isBig(i, maxPos)) {
                maxPos = i;
            }
        }
        int maxLength = String.valueOf(array[maxPos]).length();
        for (int i = 0, n = 1; i < maxLength; i++, n *= 10) {
            for (int j = 0; j < array.length; j++) {
                int yu = (array[j] / n) % 10;
                integerList[yu].add(array[j]);
            }
            int index = 0;
            for (List<Integer> list : integerList
            ) {
                for (Integer num : list
                ) {
                    array[index++] = num;
                }
            }
            display();
            for (List<Integer> list : integerList
            ) {
                list.clear();
            }
        }
    }
}
