package com.epam.university.java.core.task013;

public class VertexImpl implements Vertex {

    private int xAxis;
    private int yAxis;

    public VertexImpl(int xAxis, int yAxis) {
        this.xAxis = xAxis;
        this.yAxis = yAxis;
    }

    @Override
    public int getX() {
        return xAxis;
    }

    @Override
    public void setX(int value) {
        xAxis = value;
    }

    @Override
    public int getY() {
        return yAxis;
    }

    @Override
    public void setY(int value) {
        yAxis = value;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;
        if (o == null || getClass() != o.getClass())
            return false;
        VertexImpl vertex = (VertexImpl) o;

        return xAxis == vertex.xAxis && yAxis == vertex.yAxis;
    }

    @Override
    public int hashCode() {
        int result = xAxis;
        result = 31 * result + yAxis;
        return result;
    }
}
