package co.devfoundry.workshop.command;

import co.devfoundry.workshop.Robot;

public class RobotCutCommand implements Command {
    private Robot robot;

    public RobotCutCommand(Robot robot) {
        this.robot = robot;
    }

    @Override
    public void execute() {
        robot.cut();
    }

    @Override
    public void undo() {

    }
}
