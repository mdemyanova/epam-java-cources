package com.epam.university.java.core.task019;

public class RobotPositionImpl implements RobotPosition {

    private int x = 0;
    private int y = 0;

    @Override
    public int getX() {
        return this.x;
    }

    @Override
    public int getY() {
        return this.y;
    }

    @Override
    public void setX(int x) {
        this.x = x;
    }

    @Override
    public void setY(int y) {
        this.y = y;
    }
}
