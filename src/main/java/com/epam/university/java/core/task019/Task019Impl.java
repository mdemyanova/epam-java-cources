package com.epam.university.java.core.task019;

public class Task019Impl implements Task019 {
    @Override
    public void invokeAction(Robot robot, RobotCommand command) {
        robot.invokeAction(command);
    }

    @Override
    public boolean isOnStartPosition(Robot robot) {
        if (robot == null) {
            throw new IllegalArgumentException();
        }
        RobotPosition position = robot.getPosition();

        return (position.getX() == 0 && position.getY() == 0);
    }
}
