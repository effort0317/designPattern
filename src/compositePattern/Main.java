package compositePattern;

/*
 * Composite Pattern은 전체-부분의 관계를 가지는 객체들 간의 관계를 나타낼 때 유용하다.
 * 복합객체(Group of Objects)나 단일객체를 동일하게 취급하는 것을 목적으로 하며, 트리 구조를 표현할 때 유용하다.
 * 그러나 아마 이 글만 읽어서는 의미를 이해하는 게 쉽지 않을 것이다. 그래서 아래 예시를 통하여 좀 더 쉽게 설명하겠다.
 * 아래 예시는 ComputerDevice에 속하는 Monitor, Keyboard, Speaker가 있으며, 이것들을 담을 수 있는
 * Box가 있다. 그러나 몇몇개의 ComputerDevice를 담고 있는 Box를 좀 더 큰 Box에 담고 싶을 때의 상황을 다음 예시로
 * 나타내었다.
 */

public class Main {

	public static void main(String[] args) {
		// 그냥 Box(box)와 작은 Box객체(smallbox)를 만든다.
		Box box = new Box();
		Box smallbox = new Box();
		
		// Keyboard, Monitor, Speaker 객체를 각각 하나씩 만든다.
		ComputerDevice keyboard = new Keyboard(20000, 10);
		ComputerDevice monitor = new Monitor(100000, 50);
		ComputerDevice speaker = new Speaker(50000, 20);
		
		// Keyboard객체를 2개 더 만들어 smallbox에 담는다.
		ComputerDevice keyboard1 = new Keyboard(20000, 10);
		ComputerDevice keyboard2 = new Keyboard(20000, 10);
		smallbox.addDevice(keyboard2);
		smallbox.addDevice(keyboard1);
		
		// box에 keyboard, monitor, speaker를 담고, keyboard1과 keyboard2를 담고 있는 smallbox를 추가로 담는다. 
		box.addDevice(keyboard);
		box.addDevice(monitor);
		box.addDevice(speaker);
		box.addDevice(smallbox);
		
		System.out.println("Total Price: " + box.getPrice()); // box안에 든 ComputerDevice들의 총 가격 출력
		System.out.println("Total Power: " + box.getPower()); // box안에 든 ComputerDevice들의 총 전력량 출력
	}
}

/*
 * 위와 같은 예시로 Composite Pattern을 이용하면 여러 개의 객체를 담은 복합객체도 전체-부분의 관계에서 무조건 전체가 되는 것이 아니라 부분도 될 수 있다.
 * 이런 방법으로 전체-부분 관계를 나타내는 트리구조를 Composite Pattern으로 나타낼 수 있다.
 */ 
