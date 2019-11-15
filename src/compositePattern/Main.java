package compositePattern;

public class Main {

	public static void main(String[] args) {
		Box box = new Box();
		Box smallbox = new Box();
		
		Keyboard keyboard = new Keyboard(20000, 10);
		Monitor monitor = new Monitor(100000, 50);
		Speaker speaker = new Speaker(50000, 20);
		
		Keyboard keyboard1 = new Keyboard(20000, 10);
		Keyboard keyboard2 = new Keyboard(20000, 10);
		smallbox.addDevice(keyboard2);
		smallbox.addDevice(keyboard1);
		
		box.addDevice(keyboard);
		box.addDevice(monitor);
		box.addDevice(speaker);
		box.addDevice(smallbox);
		
		System.out.println("Total Price: " + box.getPrice());
		System.out.println("Total Power: " + box.getPower());

	}

}
