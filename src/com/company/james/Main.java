package com.company.james;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        show();
    }

    private static void show(String... list) {
        System.out.println(Arrays.toString(list));
    }


}
