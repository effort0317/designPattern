package decoratorPattern;

public abstract class DisplayDecorator extends Display {
	private Display display;
	
	public DisplayDecorator(Display display) {
		this.display=display;
	}
	
	public void draw() {
		display.draw();
	}

}
