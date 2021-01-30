package com.company.james.proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class ProxyFactory {
    private Object target;

    public ProxyFactory(Object target) {
        this.target = target;
    }

    public Object getProxyInstance() {
        return Proxy.newProxyInstance(target.getClass().getClassLoader(), new Class[]{IUserDao.class}, new InvocationHandler() {
            @Override
            public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
                System.out.println("开启事务");
                method.invoke(target, args);
                System.out.println("Commit");
                return null;
            }
        });
    }

    public static void main(String[] args) {
        IUserDao target = new UserDao();
        IUserDao proxy = (IUserDao) new ProxyFactory(target).getProxyInstance();
        proxy.save();
    }

}
