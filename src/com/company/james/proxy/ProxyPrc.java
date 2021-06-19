package com.company.james.proxy;

import java.lang.reflect.Proxy;

public class ProxyPrc {
    public static void main(String[] args) {
        Subject subject = new SubjectImpl();
        SubjectProxy subjectProxy = new SubjectProxy(subject);
        Subject proxyInstance = (Subject) Proxy.newProxyInstance(subjectProxy.getClass().getClassLoader(), subject.getClass().getInterfaces(), subjectProxy);
        proxyInstance.hello("牛逼");
    }
}
