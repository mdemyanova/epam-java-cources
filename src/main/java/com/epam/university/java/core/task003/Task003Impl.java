package com.epam.university.java.core.task003;

import java.util.*;

public class Task003Impl implements Task003 {
    @Override
    public String[] invert(String[] source) {
        if (source == null) {
            throw new IllegalArgumentException();
        }
        List listSource = Arrays.asList(source);
        Collections.reverse(listSource);

        return (String[]) listSource.toArray(source);
    }

    @Override
    public String[] join(String[] first, String[] second) {
        if (first == null || second == null) {
            throw new IllegalArgumentException();
        }
        String[] joinedArray = Arrays.copyOf(first, first.length + second.length);
        System.arraycopy(second, 0, joinedArray, first.length, second.length);

        return joinedArray;
    }

    @Override
    public int findMax(int[] source) {
        if (source == null || source.length == 0) {
            throw new IllegalArgumentException();
        }

        int i;
        int max = source[0];
        for (i = 0; i < source.length; i++) {
            if (source[i] > max) {
                max = source[i];
            }
        }

        return max;
    }

    @Override
    public String[] filter(String[] source, FilteringCondition condition) {
        if (source == null || condition == null) {
            throw new IllegalArgumentException();
        }
        source = Arrays.stream(source).filter(condition::isValid).toArray(String[]::new);

        return source;
    }

    @Override
    public String[] removeElements(String[] source, String[] toRemote) {
        if (source == null || toRemote == null) {
            throw new IllegalArgumentException();
        }
        ArrayList<String> sourceList = new ArrayList<>(Arrays.asList(source));
        ArrayList<String> remoteList = new ArrayList<>(Arrays.asList(toRemote));
        sourceList.removeAll(remoteList);

        return sourceList.toArray(new String[0]);


        //return new String[0];
    }

    @Override
    public String[] map(String[] source, MappingOperation operation) {
        if (source == null || operation == null) {
            throw new IllegalArgumentException();
        }

        int i;
        for (i = 0; i < source.length; i++) {
            source[i] = operation.map(source[i]);
        }

        return source;
    }

    @Override
    public String[] flatMap(String[] source, FlatMappingOperation operation) {
        if (source == null || operation == null) {
            throw new IllegalArgumentException();
        }
        int i, j;
        SortedSet<Integer> tree = new TreeSet<>();
        for (i = 0; i < source.length; i++) {
            String[] tmp = ((operation.flatMap(source[i])));
            for (j = 0; j < tmp.length; j++) {
                tree.add(Integer.parseInt(tmp[j]));
            }
        }
        String[] answer = new String[tree.size()];
        int x = tree.size() - 1;
        for (Integer num : tree) {
            answer[x] = num.toString();
            x--;
        }
        return answer;
    }
}
