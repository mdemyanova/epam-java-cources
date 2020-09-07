package com.epam.university.java.core.task002;

import java.util.Arrays;

public class Task002Impl implements Task002 {
    @Override
    public boolean isEquals(String firstString, String secondString) {
        if (firstString == null || secondString == null) {
            throw new IllegalArgumentException();
        }

        return firstString.equals(secondString);
    }

    @Override
    public String left(String sourceString, int number) throws IllegalArgumentException {
        if (sourceString == null || number < 0) {
            throw new IllegalArgumentException();
        }
        if (sourceString.length() > number) {
            sourceString = sourceString.substring(0, number);
        }

        return sourceString;
    }

    @Override
    public String left(String sourceString, String separator) {
        if (sourceString == null || separator == null) {
            throw new IllegalArgumentException();
        }
        String[] strArr = sourceString.split(separator);

        return strArr[0];
    }

    @Override
    public String right(String sourceString, int number) {
        if (sourceString == null || number < 0) {
            throw new IllegalArgumentException();
        }
        if (sourceString.length() > number) {
            sourceString = sourceString.substring(sourceString.length() - number);
        }

        return sourceString;

    }

    @Override
    public String right(String sourceString, String separator) {
        if (sourceString == null || separator == null) {
            throw new IllegalArgumentException();
        }

        if (!sourceString.contains(separator)) {
            return sourceString;
        }

        String[] strArr = sourceString.split(separator);

        return strArr[1];
    }

    @Override
    public String[] split(String sourceString, String split) {
        if (sourceString == null || split == null) {
            throw new IllegalArgumentException();
        }

        return sourceString.split(split);
    }

    @Override
    public String join(String[] sourceCollection, String glue) {
        if (sourceCollection == null || glue == null || sourceCollection.length == 0) {
            throw new IllegalArgumentException();
        }
        for (String x : sourceCollection) {
            if (x == null) {
                throw new IllegalArgumentException();
            }
        }

        return String.join(glue, sourceCollection);
    }
}
