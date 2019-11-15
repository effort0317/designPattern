package observerPattern;

import java.util.ArrayList;
import java.util.List;

public class ScoreRecord extends Subject {
	
	private List<DPScore> scores = new ArrayList<DPScore>();

		
	
	
	public void addScore(DPScore s) {
		scores.add(s);
	    notifyObservers();
		
	}
   
	
	public List<DPScore> getScoreRecord() {
		return scores;
	}

	
	
	public void removeScore(String name) {
		for(int i=0; i<scores.size(); i++) {
			if(scores.get(i).getName().equals(name)) {
				scores.remove(i);
			}
		}
		 notifyObservers();
		
	}

}
