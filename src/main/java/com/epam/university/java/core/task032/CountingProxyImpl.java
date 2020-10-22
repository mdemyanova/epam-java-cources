package com.epam.university.java.core.task032;

import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Map;

public class CountingProxyImpl implements CountingProxy {

    Map<String,Integer> invocations = new HashMap<>();
    private final Object target;

    public CountingProxyImpl(Object target) {
        this.target = target;
    }

    @Override
    public int getInvocationsCount(String methodName) {
        return invocations.get(methodName);
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        String methodName = method.getName();
        invocations.merge(methodName, 1, Integer::sum);
        return method.invoke(target, args);
    }
}
