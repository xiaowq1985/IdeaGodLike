package com.company.james.chain;

public class CopyrightProcess implements Process {
    @Override
    public String doProcess(String msg) {
        return msg + " CopyrightProcess";
    }
}
