package observerPattern;

import java.util.ArrayList;
import java.util.List;

/*
 *  Subject는 ScoreRecord의 데이터를 출력해 주는 Observer들을 관리해주는 클래스이다. 
 *  
 */
public class Subject {
	private List<Observer> observers = new ArrayList<Observer>(); // List로 Observer들을 관리
	
	public void addObserver(Observer o) { // Observer 추가
		observers.add(o);
	}
	
	public void notifyObservers() { // 하위 클래스인 ScoreRecord에서 사용하므로 private가 아닌 public로 처리한다.
	                                // notifyObservers()는 ScoreRecord 객체를 관찰하는 모든 Observer들에게 데이터가 변경이 되었으니
		                            //데이터 출력 업데이트를 부탁하는 update()를 실행시킨다.    	
		    for(Observer o: observers) {
			o.update();
		    }
	    }

}
