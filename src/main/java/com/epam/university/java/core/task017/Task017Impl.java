package com.epam.university.java.core.task017;

import java.util.Locale;

public class Task017Impl implements Task017 {
    @Override
    public String formatString(Object... args) {
        if (args.length == 0) {
            throw new IllegalArgumentException();
        }
        for (Object x : args) {
            if (x == null) {
                throw new IllegalArgumentException();
            }
        }

        return String.format("You know %s, %s!", args);
    }

    @Override
    public String formatNumbers(Object... args) {
        if (args.length == 0) {
            throw new IllegalArgumentException();
        }
        for (Object x : args) {
            if (x == null) {
                throw new IllegalArgumentException();
            }
        }

        return String.format(Locale.ENGLISH, "%.1f, %.2f, %+.2f, %a", args[0], args[0], args[0], args[0]);
    }

    @Override
    public String formatDates(Object... args) {
        if (args.length == 0) {
            throw new IllegalArgumentException();
        }
        for (Object x : args) {
            if (x == null) {
                throw new IllegalArgumentException();
            }
        }

        return String.format("%1$tY.0%1$te.0%1$te", args);
    }
}
