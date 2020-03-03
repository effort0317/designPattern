package decoratorPattern;

/*
 * Decorator Pattern은 기본 기능에 부가 기능들을 동적으로 추가할 때 유용한 디자인 패턴이며,
 * BufferedReader와 같은 것에 쓰인다.
 * 따로 설명이 필요 없이 예시로 바로 보여주겠다. 우선 기본 기능에 해당하는 RoadDisplay와 
 * 부가 기능에 해당하는 DisplayDecorator가 있고, RoadDisplay와 DisplayDecorator은
 * Display라는 상위 클래스를 가지고 있다. 즉 모든 클래스들의 조상을 여기서는 Display라고 해 놓은 것이다.
 * 그리고 DisplayDecorator들의 실체화 객체들을 생성하여 동적으로 RoadDisplay에 추가해준다.
 */

public class Main {

	public static void main(String[] args) {
		Display roadDisplay = new RoadDisplay();
		roadDisplay.draw();
		
		Display roadDisplayWithLane = new LaneDecorator(roadDisplay);
		roadDisplayWithLane.draw();
		
		Display roadDisplayWithTraffic = new TrafficDecorator(roadDisplayWithLane);
		roadDisplayWithTraffic.draw();
	}
}
/*
* 그런데 여기서 의문을 가질 수 있는 점이 하나 있다. 위에 부가 기능들을 기본 기능에 추가한다고 설명하였는데 , 
* 여기서는 DisplayDecorator에 Display를 멤버 변수로 선언하여 조합하였다. 
* 하지만 이런 점보다는 그냥 기본 기능에 부가기능들을 동적으로 추가하여 조합하는 결과에 초점을 두었으면 하는 것이
* 지금 할 수 있는 답변이다.  
*/