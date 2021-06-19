package com.company.james.proxy;

public class SubjectImpl implements Subject {
    @Override
    public void hello(String param) {
        System.out.println(param);
    }
}