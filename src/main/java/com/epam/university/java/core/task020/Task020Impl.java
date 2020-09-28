package com.epam.university.java.core.task020;

import java.util.*;
import java.util.regex.Pattern;
import java.util.stream.Stream;

public class Task020Impl implements Task020 {
    @Override
    public int calculate(Collection<String> stones) {
        if (stones == null || stones.isEmpty()) {
            throw new IllegalArgumentException();
        }

        List<String> list = new ArrayList<>();
        list.addAll(stones);
        Set<String> set = new HashSet<>();
        Stream.of(list.get(0).split(""))
                .filter(s -> stones.stream()
                        .allMatch(m -> Pattern.compile(s)
                                .matcher(m).find()))
                .forEach(set::add);

        return set.size();
    }
}
