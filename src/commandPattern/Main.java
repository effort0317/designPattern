package commandPattern;

/*
 *  �̺�Ʈ�� �߻����� �� ����� ����� �پ��ϸ鼭 ������ �ʿ��� ���
 *  �̺�Ʈ�� �߻���Ű�� Ŭ������ �������� �����ϰ��� �� �� ����ϴ� ������
 *  Command Pattern�̴�. Command Pattern�� ����� �����
 *  ĸ��ȭ�����ν� ����� ������ �䱸�ϴ�(�̺�Ʈ�� �߻���Ű��) ȣ���� Ŭ����(Invoker)��
 *  ���� ����� �����ϴ� ������ Ŭ����(Receiver)������ �������� �����Ѵ�.
 *  ���� ����� ����� ���濡�� Invoker�� �������� �״�� ����� �� �ֵ��� ���ش�.
 *  �Ʒ� ���ô� ���� ��ư ��ü'button'�� �ϳ� �����Ͽ� button�� ���� ����� ������ �� �ֵ���
 *  ���ش�. �� ������Ʈ������ ��� Ŭ������ ������ �� ���� ��� �о��ֽñ� �ٶ��ϴ�.
 */

public class Main {

	public static void main(String[] args) {
		
		// ��ư ����
		Button button = new Button();
		
		// CarEngineCommand ����� ���� �� Car��ü�� ������ �Ŀ� 
		// button�� ����� ������ �� ��ɿ��� Car��ü�� �����Ѵ�. 
        CarEngineCommand carcmd= new CarEngineCommand();
        Car car = new Car();
        button.setCommand(carcmd);
        carcmd.setCar(car);
        
        // ��ư Ŭ�� �� ������ ������ ������ �ݺ��Ѵ�.
        button.pressed();
        button.pressed();
        button.pressed();
        button.pressed();
        
        
        /*
        // RobotGunCommand ����� ���� �� Robot��ü�� ������ �Ŀ� 
		// button�� ����� ������ �� ��ɿ��� Robot��ü�� �����Ѵ�.  
		RobotGunCommand robotcmd = new RobotGunCommand();
		Robot robot = new Robot();
		button.setCommand(robotcmd);
		robotcmd.setRobot(robot);
        
        // ��ư Ŭ�� ��  fireGun�� �߻�ǰ� ������ �ݺ��Ѵ�. �� �Ʒ� ���뵵 �о��ֽñ� �ٶ��ϴ�.
        button.pressed();
        button.pressed();
        button.pressed();
        button.pressed();
        */ 
	}

}
/*
 * ���� ���� ���� �Ǿ����� �ϴ� ����� ��ư�� ���ý�Ű�� ��ư�� Ŭ���ϸ� �� ����� ����ȴ�.
 * �̷��� ����� �����ϰ� ���� �� ���� Button Ŭ������ �ڵ带 �������� �ʰ�(OCP�� �������� �ʰ�)
 * ����� �����ų �� �ִ�. �׸��� �� ����� ���� ��Ű�� ��� ���ó� ��� Ŭ������ �ڵ带 �������� �ʰ�
 * �����Ͽ���. ���⿡�� button�� Invoker�� �Ǹ�, Car�� Robot�� Receiver�� �ȴ�.
 * Invoker���忡���� Receiver�� �ƴ϶� Receiver�� ���� �� ����� ��ȭ��Ű�Ƿν� Invoker��
 * Receiver������ �������� �����ߴ�.
*/