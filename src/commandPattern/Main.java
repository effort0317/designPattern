package commandPattern;

public class Main {

	public static void main(String[] args) {
		Button button = new Button();
		/*
        CarEngineCommand carcmd= new CarEngineCommand();
        Car car = new Car();
        button.setCommand(carcmd);
        carcmd.setCar(car);
        */
		RobotGunCommand robotcmd = new RobotGunCommand();
		Robot robot = new Robot();
		button.setCommand(robotcmd);
		robotcmd.setRobot(robot);
        
        button.pressed();
        button.pressed();
        button.pressed();
        button.pressed();
	}

}
