package com.epam.university.java.core.task019;

public class RobotImpl implements Robot {

    private RobotPosition position;

    private String direction = "up";

    public RobotImpl() {
        this.position = new RobotPositionImpl();
    }

    @Override
    public RobotPosition getPosition() {
        return this.position;
    }

    @Override
    public void setPosition(RobotPosition position) {
        this.position.setX(position.getX());
        this.position.setY(position.getY());
    }

    @Override
    public void invokeAction(RobotCommand command) {
        switch (command) {
            case TURN_LEFT:
                if (direction.equals("up")) {
                    direction = "left";
                } else if (direction.equals("left")) {
                    direction = "down";
                } else if (direction.equals("down")) {
                    direction = "right";
                } else if (direction.equals("right")) {
                    direction = "up";
                }
                break;
            case TURN_RIGHT:
                if (direction.equals("up")) {
                    direction = "right";
                } else if (direction.equals("left")) {
                    direction = "up";
                } else if (direction.equals("down")) {
                    direction = "left";
                } else if (direction.equals("right")) {
                    direction = "down";
                }
                break;
            case MOVE_FORWARD:
                if (direction.equals("up")) {
                    position.setY(position.getY() + 1);
                } else if (direction.equals("left")) {
                    position.setX(position.getX() - 1);
                } else if (direction.equals("down")) {
                    position.setY(position.getY() - 1);
                } else if (direction.equals("right")) {
                    position.setX(position.getX() + 1);
                }
                break;
            default:
                break;
        }
    }
}
