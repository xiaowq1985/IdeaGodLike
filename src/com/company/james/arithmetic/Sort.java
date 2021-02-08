package com.company.james.arithmetic;

import java.util.Arrays;

public abstract class Sort {
    protected int array[];

    public Sort(int[] array) {
        this.array = array;
    }

    public abstract void sort();

    protected void swap(int i, int j) {
        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }

    public void display() {
        System.out.println(Arrays.toString(array));
    }

    public boolean isBig(int i, int j) {
        return array[i] > array[j] ? true : false;
    }
}
