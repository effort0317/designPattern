package commandPattern;

public class Button {
	private Command command;
	public void setCommand(Command command) {
		this.command=command;
	}
	/*
	private Car car;
	private Robot robot;
	
	public void setCar(Car car) {
		this.car = car;
	}
	
	public void setRobot(Robot robot) {
		this.robot = robot;
	}
	*/
	
	public void pressed() {
		command.execute();
	}

	

}
