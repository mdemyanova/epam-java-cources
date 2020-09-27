package com.epam.university.java.core.task025;

public class Task025Impl implements Task025 {
    @Override
    public int getAmountOfAlteredLetters(String sourceMessage) {
        if (sourceMessage == null) {
            throw new IllegalArgumentException();
        }
        if (sourceMessage.isEmpty()) {
            return 0;
        }
        if (sourceMessage.length() % 3 != 0) {
            return sourceMessage.length() % 3;
        }
        int i;
        int counter = 0;
        for (i = 0; i < sourceMessage.length(); i = i + 3) {
            String sos = sourceMessage.substring(i, i + 3);
            if (sos.charAt(0) != 'S') {
                counter++;
            }
            if (sos.charAt(1) != 'O') {
                counter++;
            }
            if (sos.charAt(2) != 'S') {
                counter++;
            }
        }

        return counter;
    }
}
