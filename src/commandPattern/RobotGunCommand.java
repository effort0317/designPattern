package commandPattern;

//RobotGunCommand, 버튼 클릭 시 로봇이 fireGun을 발사하거나 발사를 멈춘다.
public class RobotGunCommand implements Command {
     // fireGun을 발사하거나 멈출 로봇 객체 선언
	 private Robot robot;
	 
	 // 로봇 객체 세팅
	 public void setRobot(Robot robot) {
	    this.robot=robot;
	 }
	 // 기능 실행
	 public void execute() {
		robot.fireGun();
	 }

}
