package com.epam.university.java.core.task024;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class Task024Impl implements Task024 {
    @Override
    public Collection<String> getWordsCount(String source) {
        if (source == null) {
            throw new IllegalArgumentException();
        }
        if (source.isEmpty()) {
            return Collections.emptyList();
        }
        ArrayList<String> words = new ArrayList<>();
        for (String word : source.split("(?=[A-ZА-ЯÜÖ])")) {
            words.add(word.toLowerCase());
        }

        return words;
    }
}
