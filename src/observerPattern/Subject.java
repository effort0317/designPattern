package observerPattern;

import java.util.ArrayList;
import java.util.List;

/*
 *  Subject�� ScoreRecord�� �����͸� ����� �ִ� Observer���� �������ִ� Ŭ�����̴�. 
 *  
 */
public class Subject {
	private List<Observer> observers = new ArrayList<Observer>(); // List�� Observer���� ����
	
	public void addObserver(Observer o) { // Observer �߰�
		observers.add(o);
	}
	
	public void notifyObservers() { // ���� Ŭ������ ScoreRecord���� ����ϹǷ� private�� �ƴ� public�� ó���Ѵ�.
	                                // notifyObservers()�� ScoreRecord ��ü�� �����ϴ� ��� Observer�鿡�� �����Ͱ� ������ �Ǿ�����
		                            //������ ��� ������Ʈ�� ��Ź�ϴ� update()�� �����Ų��.    	
		    for(Observer o: observers) {
			o.update();
		    }
	    }

}
