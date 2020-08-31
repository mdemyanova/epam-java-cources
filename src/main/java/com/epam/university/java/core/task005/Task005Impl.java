package com.epam.university.java.core.task005;

public class Task005Impl implements Task005 {


    int firstNumber;
    int secondNumber;
    int currentFirstNumber;
    int currentSecondNumber;
    double result;
    double min = 1000000.0;

    @Override
    public PiHolder findPi(int digits) {

        switch (digits) {
            case 1:
                for (currentFirstNumber = 9; currentFirstNumber > 0; currentFirstNumber--) {
                    for (currentSecondNumber = 1; currentSecondNumber < 9; currentSecondNumber++) {
                        result = Math.abs((currentFirstNumber / currentSecondNumber) - Math.PI);
                        if (result < min) {
                            result = min;
                            firstNumber = currentFirstNumber;
                            secondNumber = currentSecondNumber;
                        }
                    }
                }
                break;
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


//            case 2:
//                currentFirstNumber = 99;
//                currentSecondNumber = 10;
//                break;
//        double result;
//        double min = 1000000.0;
//
//        while (currentFirstNumber > currentSecondNumber) {
//            result = Math.abs((currentFirstNumber / currentSecondNumber) - Math.PI);
//            if (result < min) {
//                min = result;
//                firstNumber = currentFirstNumber;
//                secondNumber = currentSecondNumber;
//
//            }
//            currentFirstNumber--;
//            currentSecondNumber++;
//        }
//        PiHolder pi = new PiHolder() {
//            @Override
//            public int getFirst() {
//                return firstNumber;
//            }
//
//            @Override
//            public int getSecond() {
//                return secondNumber;
//            }
//        };

