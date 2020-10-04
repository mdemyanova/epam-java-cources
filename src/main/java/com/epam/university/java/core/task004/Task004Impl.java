package com.epam.university.java.core.task004;

import java.util.ArrayList;
import java.util.LinkedHashSet;

public class Task004Impl implements Task004 {
    @Override
    public String[] intersection(String[] first, String[] second) {
        if (first == null || second == null) {
            throw new IllegalArgumentException();
        }

        ArrayList<String> intersect = new ArrayList<>();
        int i;
        int j;
        for (i = 0; i < first.length; i++) {
            for (j = 0; j < second.length; j++) {
                if (first[i].equals(second[j])) {
                    intersect.add(first[i]);
                }
            }
        }
        return intersect.toArray(new String[0]);
    }

    @Override
    public String[] union(String[] first, String[] second) {
        if (first == null || second == null) {
            throw new IllegalArgumentException();
        }
        LinkedHashSet<String> union = new LinkedHashSet<>();
        int i;
        int j;
        for (i = 0; i < first.length; i++) {
            union.add(first[i]);
        }
        for (j = 0; j < second.length; j++) {
            union.add(second[j]);
        }
        return union.toArray(new String[0]);
    }
}
