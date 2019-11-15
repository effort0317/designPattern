package commandPattern;

public class RobotGunCommand implements Command {

	 private Robot robot;
	    public void setRobot(Robot robot) {
	    	this.robot=robot;
	    }
		public void execute() {
			robot.fireGun();
		}

}
