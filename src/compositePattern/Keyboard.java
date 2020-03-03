package compositePattern;

public class Keyboard extends ComputerDevice {
	private int price; // Keyboard 가격
	private int power; // Keyboard 전력
	
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
