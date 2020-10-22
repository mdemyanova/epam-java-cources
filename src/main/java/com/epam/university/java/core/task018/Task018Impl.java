package com.epam.university.java.core.task018;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Parameter;

public class Task018Impl implements Task018 {

    @Override
    @SuppressWarnings("unchecked")
    public boolean isAnnotationPresent(Object toCheck, Class annotationToFind) {

        if (toCheck == null || annotationToFind == null) {
            throw new IllegalArgumentException();
        }

        Class clazz = toCheck.getClass();
        if (clazz.isAnnotationPresent(annotationToFind)) {

            return true;
        }

        Package clazzPackage = clazz.getPackage();
        if (clazzPackage.isAnnotationPresent(annotationToFind)) {

            return true;
        }

        Field[] fields = clazz.getDeclaredFields();
        for (Field field : fields) {
            if (field.isAnnotationPresent(annotationToFind)) {
                return true;
            }
        }

        Constructor[] constructors = clazz.getDeclaredConstructors();
        for (Constructor constructor : constructors) {
            if (constructor.isAnnotationPresent(annotationToFind)) {
                return true;
            }

            Parameter[] parameters = constructor.getParameters();
            for (Parameter parameter : parameters) {
                if (parameter.isAnnotationPresent(annotationToFind)) {
                    return true;
                }
            }
        }

        Method[] methods = clazz.getDeclaredMethods();
        for (Method method : methods) {
            if (method.isAnnotationPresent(annotationToFind)) {
                return true;
            }

            Parameter[] parameters = method.getParameters();
            for (Parameter parameter : parameters) {
                if (parameter.isAnnotationPresent(annotationToFind)) {
                    return true;
                }
            }
        }

        return false;
    }
}
