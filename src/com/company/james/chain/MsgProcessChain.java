package com.company.james.chain;

import java.util.LinkedList;
import java.util.List;

public class MsgProcessChain implements Process {
    List<Process> list = new LinkedList<>();

    public MsgProcessChain addChain(Process process) {
        list.add(process);
        return this;
    }

    @Override
    public String doProcess(String msg) {
        StringBuilder stringBuilder = new StringBuilder();
        for (Process process:list
             ) {
            stringBuilder.append(process.doProcess("xiaowq"));
        }
        return stringBuilder.toString();
    }
}
