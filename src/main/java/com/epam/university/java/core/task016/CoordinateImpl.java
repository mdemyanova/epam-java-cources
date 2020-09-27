package com.epam.university.java.core.task016;

import java.util.Objects;

public class CoordinateImpl implements Coordinate {

    private int xAxis;
    private int yAxis;

    public CoordinateImpl(int xAxis, int yAxis) {
        this.xAxis = xAxis;
        this.yAxis = yAxis;
    }

    @Override
    public int getX() {
        return xAxis;
    }

    @Override
    public void setX(int x) {
        throw new UnsupportedOperationException();
    }

    @Override
    public int getY() {
        return yAxis;
    }

    @Override
    public void setY(int y) {
        throw new UnsupportedOperationException();
    }

    @Override
    public String toString() {
        return String.format("(%d, %d)", xAxis, yAxis);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;
        if (o == null || getClass() != o.getClass())
            return false;
        CoordinateImpl that = (CoordinateImpl) o;

        return xAxis == that.xAxis &&
                yAxis == that.yAxis;
    }

    @Override
    public int hashCode() {
        int result = xAxis;
        result = 39 * result + yAxis;
        return result;
    }
}
