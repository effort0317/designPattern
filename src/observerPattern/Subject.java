package observerPattern;

import java.util.ArrayList;
import java.util.List;

public class Subject {
	private List<Observer> observers = new ArrayList<Observer>(); // ������ ������ ��밡���ϴϱ� ����Ʈ�� ����.
	
	public void addObserver(Observer o) {
		observers.add(o);
	}
	
	public void notifyObservers() { // ���� Ŭ������ ScoreRecord���� ����ϹǷ� private�� �ƴ� public�� ó���Ѵ�.
	    	
		    for(Observer o: observers) {
			o.update();
		    }// ScoreRecord ��ü�� �����ϴ� ��� ������ ��üȭ ��ü�鿡�� ������Ʈ ��û, Refactor->Extract method�� �޼ҵ�ȭ, ������ ����ϴϱ� �����丵���� Extract method�� ���� ��.
	    }

}
