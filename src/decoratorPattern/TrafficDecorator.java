package decoratorPattern;

public class TrafficDecorator extends DisplayDecorator {
	public TrafficDecorator(Display display) {
		super(display);
	}
	public void draw() {
		super.draw();
		displayTraffic();
	}

	private void displayTraffic() {
		System.out.println("교통량 표시");
		
	}

}
