package decoratorPattern;

public class LaneDecorator extends DisplayDecorator {
	public LaneDecorator(Display display) {
		super(display);
		
	}
	public void draw() {
		super.draw();
		displayLane();
	}

	private void displayLane() {
		System.out.println("차선 표시");
		
	}

}
