package compositePattern;

import java.util.ArrayList;
import java.util.List;

public class Box extends ComputerDevice{ // �ڽ��� �ڽ��� ���� �� �ֵ��� ��ǻ�� ����̽��� ���� �������� ���� ->������ ��������
	private List<ComputerDevice> devices = new ArrayList<ComputerDevice>();
	
	public void addDevice(ComputerDevice device) {
		devices.add(device);
	}
    
	public void removeDevice(ComputerDevice device) {
		devices.remove(device);
	}
	
	public int getPrice() {
		int totalPrice = 0;
		for(ComputerDevice device: devices) {
			totalPrice +=device.getPrice();
		}
		return totalPrice;
		
	}
	
	public int getPower() {
		int totalPower = 0;
		for(ComputerDevice device: devices) {
			totalPower +=device.getPower();
		}
		return totalPower;
		
	}

}
