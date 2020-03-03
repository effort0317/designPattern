package compositePattern;

import java.util.ArrayList;
import java.util.List;

public class Box extends ComputerDevice{ // Box가 Box를 담을 수 있도록 ComputerDevice의 하위 개념으로 설정 ->Composite Pattern
	// Box가 여러개의 ComputerDevice를 담을 수 있도록 리스트 설정
	private List<ComputerDevice> devices = new ArrayList<ComputerDevice>();
	
	// ComputerDevice 추가
	public void addDevice(ComputerDevice device) {
		devices.add(device);
	}
    // ComputerDevice 제거
	public void removeDevice(ComputerDevice device) {
		devices.remove(device);
	}
	// Box안에 담긴 ComputerDevice들의 총 가격 
	public int getPrice() {
		int totalPrice = 0;
		for(ComputerDevice device: devices) {
			totalPrice +=device.getPrice();
		}
		return totalPrice;
	}
	// Box안에 담긴 ComputerDevice들의 총 전력량
	public int getPower() {
		int totalPower = 0;
		for(ComputerDevice device: devices) {
			totalPower +=device.getPower();
		}
		return totalPower;
	}

}
