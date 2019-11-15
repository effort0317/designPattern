package commandPattern;

public class CarEngineCommand implements Command {
    private Car car;
    public void setCar(Car car) {
    	this.car=car;
    }
	public void execute() {
		car.engine();
	}

}
