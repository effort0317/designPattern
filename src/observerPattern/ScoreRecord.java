package observerPattern;

import java.util.ArrayList;
import java.util.List;

public class ScoreRecord extends Subject {
	
	// 여러 DPScore가 존재하므로 List로 설정하였다.
	private List<DPScore> scores = new ArrayList<DPScore>();

	public void addScore(DPScore s) { // DPScore 추가 후 통보
		scores.add(s);
	    notifyObservers(); // 통보
	}
   
	
	public List<DPScore> getScoreRecord() {
		return scores;
	}

	
	
	public void removeScore(String name) { // DPScore 제거 후 통보
		for(int i=0; i<scores.size(); i++) {
			if(scores.get(i).getName().equals(name)) {
				scores.remove(i);
			}
		}
		 notifyObservers(); // 통보
	}

}
