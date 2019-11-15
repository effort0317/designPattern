package compositePattern;

import java.util.ArrayList;
import java.util.List;

public class Box extends ComputerDevice{ // 박스가 박스를 담을 수 있도록 컴퓨터 디바이스의 하위 개념으로 설정 ->컴퍼짓 설계패턴
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
