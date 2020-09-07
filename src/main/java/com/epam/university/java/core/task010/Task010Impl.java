package com.epam.university.java.core.task010;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Task010Impl implements Task010 {
    @Override
    public Map<String, Integer> countWordNumbers(File source) {
        if (source == null) {
            throw new IllegalArgumentException();
        }

        Map<String, Integer> myMap = new HashMap<>();
        try {
            Scanner scanner = new Scanner(source);
            while (scanner.hasNext()) {
                String word = scanner.next().toLowerCase().trim();
                if (myMap.containsKey(word)) {
                    int value = myMap.get(word);
                    value++;
                    myMap.put(word, value);
                } else {
                    myMap.put(word, 1);
                }
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

        return myMap;
    }
}
