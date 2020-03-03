package commandPattern;

//RobotGunCommand, ��ư Ŭ�� �� �κ��� fireGun�� �߻��ϰų� �߻縦 �����.
public class RobotGunCommand implements Command {
     // fireGun�� �߻��ϰų� ���� �κ� ��ü ����
	 private Robot robot;
	 
	 // �κ� ��ü ����
	 public void setRobot(Robot robot) {
	    this.robot=robot;
	 }
	 // ��� ����
	 public void execute() {
		robot.fireGun();
	 }

}
