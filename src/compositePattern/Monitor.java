package compositePattern;

public class Monitor extends ComputerDevice{
	private int price; // Monitor 가격
	private int power; // Monitor 전력
	
	public Monitor(int price, int power) {
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
