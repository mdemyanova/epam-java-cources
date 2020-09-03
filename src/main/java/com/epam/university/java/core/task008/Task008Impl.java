package com.epam.university.java.core.task008;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

public class Task008Impl implements Task008 {
    @Override
    public boolean isValid(String sourceString) {

        if (sourceString == null) {
            throw new IllegalArgumentException();
        }
        if (sourceString.equals("")) {
            return true;
        }

        char[] charArray = sourceString.toCharArray();
        int i;
        int bracesCounter = 0;
        int bracketsCounter = 0;
        int parenthesesCounter = 0;
        for (i = 0; i < charArray.length; i++) {
            if (charArray[i] == '{' || charArray[i] == '}') {
                bracesCounter++;
            }
            if (charArray[i] == '[' || charArray[i] == ']') {
                bracketsCounter++;
            }
            if (charArray[i] == '(' || charArray[i] == ')') {
                parenthesesCounter++;
            }
        }
        if (bracesCounter % 2 == 1 || bracketsCounter % 2 == 1 || parenthesesCounter % 2 == 1) {
            return false;
        }

        Stack<Character> stack = new Stack<>();
        Map<Character, Character> map = new HashMap<>();
        map.put('{', '}');
        map.put('[', ']');
        map.put('(', ')');
        for (char ch : charArray) {
            if (map.containsKey(ch)) {
                stack.push(ch);
            } else if (map.containsValue(ch)) {
                if (stack.isEmpty() || map.get(stack.pop()) != ch) {
                    return false;
                }
            }
        }
        return stack.isEmpty();
    }
}