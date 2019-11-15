package observerPattern;

import java.util.ArrayList;
import java.util.List;

public class Subject {
	private List<Observer> observers = new ArrayList<Observer>(); // 옵저버 여러개 사용가능하니까 리스트로 만듬.
	
	public void addObserver(Observer o) {
		observers.add(o);
	}
	
	public void notifyObservers() { // 하위 클래스인 ScoreRecord에서 사용하므로 private가 아닌 public로 처리한다.
	    	
		    for(Observer o: observers) {
			o.update();
		    }// ScoreRecord 객체를 관찰하는 모든 옵저버 실체화 객체들에게 업데이트 요청, Refactor->Extract method로 메소드화, 여러번 사용하니까 리팩토링으로 Extract method로 만든 것.
	    }

}
