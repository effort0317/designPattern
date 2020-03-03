package compositePattern;

import java.util.ArrayList;
import java.util.List;

public class Box extends ComputerDevice{ // Box�� Box�� ���� �� �ֵ��� ComputerDevice�� ���� �������� ���� ->Composite Pattern
	// Box�� �������� ComputerDevice�� ���� �� �ֵ��� ����Ʈ ����
	private List<ComputerDevice> devices = new ArrayList<ComputerDevice>();
	
	// ComputerDevice �߰�
	public void addDevice(ComputerDevice device) {
		devices.add(device);
	}
    // ComputerDevice ����
	public void removeDevice(ComputerDevice device) {
		devices.remove(device);
	}
	// Box�ȿ� ��� ComputerDevice���� �� ���� 
	public int getPrice() {
		int totalPrice = 0;
		for(ComputerDevice device: devices) {
			totalPrice +=device.getPrice();
		}
		return totalPrice;
	}
	// Box�ȿ� ��� ComputerDevice���� �� ���·�
	public int getPower() {
		int totalPower = 0;
		for(ComputerDevice device: devices) {
			totalPower +=device.getPower();
		}
		return totalPower;
	}

}
