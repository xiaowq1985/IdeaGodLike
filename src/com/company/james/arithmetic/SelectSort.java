package com.company.james.arithmetic;

public class SelectSort extends Sort {

    public SelectSort(int[] array) {
        super(array);
    }

    public void sort() {
        System.out.println("Origin");
        display();
        for (int i = 0; i < array.length - 1; i++) {
            int minPosition = i;
            for (int j = i + 1; j < array.length; j++) {
                if (array[minPosition] > array[j]) {
                    minPosition = j;
                }
            }
            swap(i, minPosition);
            System.out.println("第" + i + "次循环");
            display();
        }
        System.out.println("Finally");
        display();
    }
}
