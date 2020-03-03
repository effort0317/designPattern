package compositePattern;

public class Monitor extends ComputerDevice{
	private int price; // Monitor ����
	private int power; // Monitor ����
	
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
