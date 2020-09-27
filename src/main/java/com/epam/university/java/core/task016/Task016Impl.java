package com.epam.university.java.core.task016;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class Task016Impl implements Task016 {

    @Override
    public Collection<Coordinate> getSquaresInsideCircle(int radius) {
        if (radius < 1) {
            throw new IllegalArgumentException();
        }

        List<Coordinate> coordinates = new ArrayList<>();
        CoordinateFactory coordinateFactory = new CoordinateFactoryImpl();
        for (int x = 1; x < radius * 2; x++) {
            for (int y = 1; y < radius * 2; y++) {
                if ((x * x) + (y * y) < radius * radius * 4) {
                    coordinates.add(coordinateFactory.newInstance(x, y));
                    coordinates.add(coordinateFactory.newInstance(x, -y));
                    coordinates.add(coordinateFactory.newInstance(-x, y));
                    coordinates.add(coordinateFactory.newInstance(-x, -y));
                }
            }
        }

        return coordinates;
    }
}
