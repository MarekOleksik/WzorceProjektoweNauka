package co.devfoundry.workshop.command;

import co.devfoundry.workshop.Robot;

public class RobotTurnOffCommand implements Command {
    private Robot robot;

    public RobotTurnOffCommand(Robot robot) {
        this.robot = robot;
    }

    @Override
    public void execute() {
        robot.turnOff();
    }

    @Override
    public void undo() {
        robot.turnOn();
    }
}
