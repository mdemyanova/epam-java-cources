package com.epam.university.java.core.task022;

import java.util.ArrayList;
import java.util.Collection;

public class Task022Impl implements Task022 {
    @Override
    public int maxSum(Collection<Integer> numbers) {
        if (numbers == null || numbers.isEmpty()) {
            throw new IllegalArgumentException();
        }
        ArrayList array = new ArrayList(numbers);
        int min = Integer.valueOf((Integer) array.get(0));
        int sum = 0;
        for (Integer i : numbers) {
            if (i < min) {
                min = i;
            }
            sum += i;
        }

        return sum - min;
    }

    @Override
    public int minSum(Collection<Integer> numbers) {
        if (numbers == null || numbers.isEmpty()) {
            throw new IllegalArgumentException();
        }
        ArrayList array = new ArrayList(numbers);
        int max = Integer.valueOf((Integer) array.get(0));
        int sum = 0;
        for (Integer i : numbers) {
            if (i > max) {
                max = i;
            }
            sum += i;
        }

        return sum - max;
    }
}
