package com.epam.university.java.core.task007;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class Task007Impl implements Task007 {
    @Override
    public Collection<Integer> multiplyPolynomial(Collection<Integer> first,
                                                  Collection<Integer> second) {
        if (first == null || second == null) {
            throw new IllegalArgumentException();
        }

        ArrayList<Integer> firstParam = new ArrayList<>(first);
        ArrayList<Integer> secondParam = new ArrayList<>(second);
        Integer[] resultArray = new Integer[first.size() + second.size() - 1];

        int k;
        for (k = 0; k < first.size() + second.size() - 1; k++) {
            resultArray[k] = 0;
        }

        int i;
        int j;
        for (i = 0; i < firstParam.size(); i++) {
            for (j = 0; j < secondParam.size(); j++) {
                resultArray[i + j] += firstParam.get(i) * secondParam.get(j);
            }
        }

        ArrayList<Integer> resultList = new ArrayList<>();
        Collections.addAll(resultList, resultArray);
        return resultList;
    }
}
