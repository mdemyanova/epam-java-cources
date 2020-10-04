package com.epam.university.java.core.task027;

import java.util.Collection;
import java.util.List;
import java.util.ArrayList;

public class Task027Impl implements Task027 {
    @Override
    public Collection<Integer> extract(String sourceString) {
        if (sourceString == null) {
            throw new IllegalArgumentException();
        }

        for (int i = 1; i <= sourceString.length() / 2; i++) {
            List<Integer> integers = new ArrayList<>();
            String sequence = sourceString.substring(0, i);
            if (sequence.startsWith("0")) {
                break;
            }

            int ai = Integer.parseInt(sequence);
            integers.add(ai);
            int counter = 1;
            while (sequence.length() < sourceString.length()) {
                sequence = sequence.concat(String.valueOf(ai + counter));
                integers.add(ai + counter);
                counter++;
            }
            if (sourceString.equals(sequence)) {
                return integers;
            }
        }

        return new ArrayList<>();
    }
}