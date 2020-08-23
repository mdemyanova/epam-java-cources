package com.epam.university.java.core.task003;

public class MappingOperationImpl implements MappingOperation {
    @Override
    public String map(String source) {
        if (source == null) {
            throw new IllegalArgumentException();
        }
        char[] cropped = source.toCharArray();
        String reversed = "";

        for (int i = cropped.length-1; i >= 0; i--) {
            reversed += cropped[i];
        }

        return reversed;
    }
}
