package com.epam.university.java.core.task009;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

public class Task009Impl implements Task009 {
    @Override
    public Collection<String> countWords(File sourceFile) {
        if (sourceFile == null) {
            throw new IllegalArgumentException();
        }
        Set<String> set = new TreeSet<>();

        try {
            Scanner scanner = new Scanner(sourceFile);
            while (scanner.hasNext()) {
                String word = scanner.next()
                        .toLowerCase()
                        .replace(".", "")
                        .replace("?", "")
                        .replace(":", "")
                        .replace(",", "");
                if (!word.isEmpty()) {
                    set.add(word);
                }
            }
            scanner.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

        return set;
    }
}
