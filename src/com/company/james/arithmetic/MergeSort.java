package com.company.james.arithmetic;

public class MergeSort extends Sort {

    public MergeSort(int[] array) {
        super(array);
    }

    @Override
    public void sort() {

    }

    public void merge(int low, int high) {
        int middle = (high + low) >> 1;
        if (low < high) {
            merge(low, middle);
            merge(middle + 1, high);
            mergeSort(low, middle, high);
        }
    }

    public void mergeSort(int low, int middle, int high) {
        int i = low;
        int j = middle + 1;
        int k = 0;
        int temp[] = new int[high - low + 1];
        while (i <= middle && j <= high) {
            if (array[i] <= array[j]) {
                temp[k++] = array[i++];
            } else {
                temp[k++] = array[j++];
            }
        }
        while (i <= middle) {
            temp[k++] = array[i++];
        }
        while (j <= high) {
            temp[k++] = array[j++];
        }
        for (int l = 0; l < temp.length; l++) {
            array[low + l] = temp[l];
        }
    }

}
