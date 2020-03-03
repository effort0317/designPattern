package compositePattern;

/*
 * Composite Pattern�� ��ü-�κ��� ���踦 ������ ��ü�� ���� ���踦 ��Ÿ�� �� �����ϴ�.
 * ���հ�ü(Group of Objects)�� ���ϰ�ü�� �����ϰ� ����ϴ� ���� �������� �ϸ�, Ʈ�� ������ ǥ���� �� �����ϴ�.
 * �׷��� �Ƹ� �� �۸� �о�� �ǹ̸� �����ϴ� �� ���� ���� ���̴�. �׷��� �Ʒ� ���ø� ���Ͽ� �� �� ���� �����ϰڴ�.
 * �Ʒ� ���ô� ComputerDevice�� ���ϴ� Monitor, Keyboard, Speaker�� ������, �̰͵��� ���� �� �ִ�
 * Box�� �ִ�. �׷��� ���� ComputerDevice�� ��� �ִ� Box�� �� �� ū Box�� ��� ���� ���� ��Ȳ�� ���� ���÷�
 * ��Ÿ������.
 */

public class Main {

	public static void main(String[] args) {
		// �׳� Box(box)�� ���� Box��ü(smallbox)�� �����.
		Box box = new Box();
		Box smallbox = new Box();
		
		// Keyboard, Monitor, Speaker ��ü�� ���� �ϳ��� �����.
		ComputerDevice keyboard = new Keyboard(20000, 10);
		ComputerDevice monitor = new Monitor(100000, 50);
		ComputerDevice speaker = new Speaker(50000, 20);
		
		// Keyboard��ü�� 2�� �� ����� smallbox�� ��´�.
		ComputerDevice keyboard1 = new Keyboard(20000, 10);
		ComputerDevice keyboard2 = new Keyboard(20000, 10);
		smallbox.addDevice(keyboard2);
		smallbox.addDevice(keyboard1);
		
		// box�� keyboard, monitor, speaker�� ���, keyboard1�� keyboard2�� ��� �ִ� smallbox�� �߰��� ��´�. 
		box.addDevice(keyboard);
		box.addDevice(monitor);
		box.addDevice(speaker);
		box.addDevice(smallbox);
		
		System.out.println("Total Price: " + box.getPrice()); // box�ȿ� �� ComputerDevice���� �� ���� ���
		System.out.println("Total Power: " + box.getPower()); // box�ȿ� �� ComputerDevice���� �� ���·� ���
	}
}

/*
 * ���� ���� ���÷� Composite Pattern�� �̿��ϸ� ���� ���� ��ü�� ���� ���հ�ü�� ��ü-�κ��� ���迡�� ������ ��ü�� �Ǵ� ���� �ƴ϶� �κе� �� �� �ִ�.
 * �̷� ������� ��ü-�κ� ���踦 ��Ÿ���� Ʈ�������� Composite Pattern���� ��Ÿ�� �� �ִ�.
 */ 
