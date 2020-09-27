package com.epam.university.java.core.task023;

public class Task023Impl implements Task023 {
    @Override
    public String extract(String phoneString) {
        if (phoneString == null) {
            throw new IllegalArgumentException();
        }
        if (phoneString.length() < 10) {
            throw new IllegalArgumentException();
        }
        String operator = phoneString.replaceAll("[+ .,;:!?/'()-]", "");
        operator = operator.substring(1, 4);

        return operator;
    }
}
