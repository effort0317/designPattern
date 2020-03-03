package compositePattern;

public class Speaker extends ComputerDevice{
	private int price; // Speaker ����
	private int power; // Speaker ����
	
	public Speaker(int price, int power) {
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
