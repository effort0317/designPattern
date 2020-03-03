package compositePattern;

public class Speaker extends ComputerDevice{
	private int price; // Speaker 가격
	private int power; // Speaker 전력
	
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
