package com.epam.university.java.core.task028;

public class Task028Impl implements Task028 {
    private int answer = 0;

    @Override
    public int getWays(int value, int power) {
        calculation(value, value, power, 0);
        return answer;
    }

    void calculation(int value, int remain, int power, int used) {
        if (remain == 0) {
            answer++;
        }
        if (remain > 0) {
            int root = (int) Math.pow(value, 1.0 / power);
            for (int i = used + 1; i <= root; i++) {
                int newRemain = (remain - (int) Math.pow(i, power));
                if (newRemain >= 0) {
                    calculation(value, newRemain, power, i);
                } else {
                    break;
                }
            }
        }
    }
}
