package com.epam.university.java.core.task011;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;

public class Task011Impl implements Task011 {
    @Override
    public String getLastName(String[] collection) {
        if (collection == null || collection.length == 0) {
            throw new IllegalArgumentException();
        }
        if (collection.length == 1) {
            return collection[0];
        }

        ArrayList<String> list = new ArrayList<>(Arrays.asList(collection));

        int cursor = 0;
        while (list.size() > 1) {
            list.remove(cursor);
            cursor = (cursor + 1) % list.size();
        }

        return list.get(0);
    }

    @Override
    public String getLastName(ArrayList<String> collection) {
        if (collection == null || collection.isEmpty()) {
            throw new IllegalArgumentException();
        }
        int cursor = 0;
        while (collection.size() > 1) {
            collection.remove(cursor);
            cursor = (cursor + 1) % collection.size();
        }

        return collection.get(0);
    }

    @Override
    public String getLastName(LinkedList<String> collection) {
        if (collection == null || collection.isEmpty()) {
            throw new IllegalArgumentException();
        }
        int cursor = 0;
        while (collection.size() > 1) {
            collection.remove(cursor);
            cursor = (cursor + 1) % collection.size();
        }

        return collection.get(0);
    }
}
