package commandPattern;

// CarEngineCommand, 버튼 클릭 시 자동차 엔진이 켜지고 꺼진다.
public class CarEngineCommand implements Command {
	// 엔진이 켜지거나 꺼질 자동차 객체 선언
    private Car car;
    
    // 자동차 객체 세팅
    public void setCar(Car car) {
    	this.car=car;
    }
    // 기능 실행
	public void execute() {
		car.engine();
	}

}
