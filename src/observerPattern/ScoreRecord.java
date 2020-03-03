package observerPattern;

import java.util.ArrayList;
import java.util.List;

public class ScoreRecord extends Subject {
	
	// ���� DPScore�� �����ϹǷ� List�� �����Ͽ���.
	private List<DPScore> scores = new ArrayList<DPScore>();

	public void addScore(DPScore s) { // DPScore �߰� �� �뺸
		scores.add(s);
	    notifyObservers(); // �뺸
	}
   
	
	public List<DPScore> getScoreRecord() {
		return scores;
	}

	
	
	public void removeScore(String name) { // DPScore ���� �� �뺸
		for(int i=0; i<scores.size(); i++) {
			if(scores.get(i).getName().equals(name)) {
				scores.remove(i);
			}
		}
		 notifyObservers(); // �뺸
	}

}
