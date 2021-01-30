package com.company.james.chain;

public class SensitiveWordProcess implements Process {
    @Override
    public String doProcess(String msg) {
        return msg + " SensitiveWordProcess";
    }
}
