package commandPattern;

// CarEngineCommand가 실행 될 시 엔진이 켜고 꺼질 자동차 객체를 생성하는 클래스
public class Car {
	// 처음에는 엔진이 꺼져있는 상태이다.
	private boolean on = false;
	// 엔진 실행 혹은 멈춤, 여기에서는 엔진의 상태를 표현하기 위해 'System.out.println'을
	// 이용하여 엔진의 상태를 표현한다. 
	public void engine() {
		 on = !on;
		   if(on)
		      System.out.println("Engine on");
		   else 
		      System.out.println("Engine off");
	}

}
