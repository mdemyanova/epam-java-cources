package com.epam.university.java.core.task005;

public class Task005Impl implements Task005 {

    int firstNumber;
    int secondNumber;
    double currentFirstNumber;
    double currentSecondNumber;
    double result;
    double min = 1000000.0;

    @Override
    public PiHolder findPi(int digits) {
        if (digits == 0 || digits > 10) {
            throw new IllegalArgumentException();
        }

        // ---One digit---
        if (digits == 1) {
            for (currentFirstNumber = 1; currentFirstNumber <= 9; currentFirstNumber++) {
                for (currentSecondNumber = 1; currentSecondNumber < currentFirstNumber; currentSecondNumber++) {
                    result = Math.abs((currentFirstNumber / currentSecondNumber) - Math.PI);
                    if (result < min) {
                        min = result;
                        firstNumber = (int) currentFirstNumber;
                        secondNumber = (int) currentSecondNumber;
                    }
                }
            }
        // ---Two digits---
        } else if (digits == 2) {
            for (currentFirstNumber = 10; currentFirstNumber <= 99; currentFirstNumber++) {
                for (currentSecondNumber = 10; currentSecondNumber < currentFirstNumber; currentSecondNumber++) {
                    result = Math.abs((currentFirstNumber / currentSecondNumber) - Math.PI);
                    if (result < min) {
                        min = result;
                        firstNumber = (int) currentFirstNumber;
                        secondNumber = (int) currentSecondNumber;
                    }
                }
            }
        // ---Three digits---
        } else if (digits == 3) {
            for (currentFirstNumber = 100; currentFirstNumber <= 999; currentFirstNumber++) {
                for (currentSecondNumber = 100; currentSecondNumber < currentFirstNumber; currentSecondNumber++) {
                    result = Math.abs((currentFirstNumber / currentSecondNumber) - Math.PI);
                    if (result < min) {
                        min = result;
                        firstNumber = (int) currentFirstNumber;
                        secondNumber = (int) currentSecondNumber;
                    }
                }
            }
        // ---Four digits---
        } else if (digits == 4) {
            for (currentFirstNumber = 1000; currentFirstNumber <= 9999; currentFirstNumber++) {
                for (currentSecondNumber = 1000; currentSecondNumber < currentFirstNumber; currentSecondNumber++) {
                    result = Math.abs((currentFirstNumber / currentSecondNumber) - Math.PI);
                    if (result < min) {
                        min = result;
                        firstNumber = (int) currentFirstNumber;
                        secondNumber = (int) currentSecondNumber;
                    }
                }
            }
        }
        // ---Five digits---
        else if (digits == 5) {
            for (currentFirstNumber = 30000; currentFirstNumber <= 99999; currentFirstNumber++) {
                for (currentSecondNumber = 10000; currentSecondNumber < currentFirstNumber / 3; currentSecondNumber++) {
                    result = Math.abs((currentFirstNumber / currentSecondNumber) - Math.PI);
                    if (result < min) {
                        min = result;
                        firstNumber = (int) currentFirstNumber;
                        secondNumber = (int) currentSecondNumber;
                    }
                }
            }
        }

        PiHolder pi = new PiHolder() {
            @Override
            public int getFirst() {
                return firstNumber;
            }

            @Override
            public int getSecond() {
                return secondNumber;
            }
        };
        return pi;
    }
}