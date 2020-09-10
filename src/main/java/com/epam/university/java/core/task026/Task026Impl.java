package com.epam.university.java.core.task026;

public class Task026Impl implements Task026 {
    @Override
    public String encrypt(String sourceString, int shift) {
        if (sourceString == null) {
            throw new IllegalArgumentException();
        }

        char[] message = sourceString.toCharArray();
        for (int i = 0; i < message.length; i++) {
            if (Character.isLetter(message[i])) {
                if (Character.isUpperCase(message[i])) {
                    message[i] = (char) ((message[i] + shift - 65) % 26 + 65);
                }
                if (Character.isLowerCase(message[i])) {
                    message[i] = (char) ((message[i] + shift - 97) % 26 + 97);
                }
            }
        }
        String encrypted = "";
        for (char x : message) {
            encrypted += x;
        }

        return encrypted;
    }

    @Override
    public String decrypt(String encryptedString, int shift) {
        char[] message = encryptedString.toCharArray();
        for (int i = 0; i < message.length; i++) {
            if (Character.isLetter(message[i])) {
                if (Character.isUpperCase(message[i])) {
                    message[i] = (char) ((message[i] - shift - 90) % 26 + 90);
                }
                if (Character.isLowerCase(message[i])) {
                    message[i] = (char) ((message[i] - shift - 122) % 26 + 122);
                }
            }
        }
        String decrypted = "";
        for (char x : message) {
            decrypted += x;
        }

        return decrypted;
    }
}
