package compositePattern;

public class Keyboard extends ComputerDevice {
	private int price; // Keyboard ����
	private int power; // Keyboard ����
	
	public Keyboard(int price, int power) {
		this.price = price;
		this.power = power;
	}

	public int getPrice() {
		return price;
	}

	public int getPower() {
		return power;
	}

}
