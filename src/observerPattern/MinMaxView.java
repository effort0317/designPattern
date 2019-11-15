package observerPattern;

import java.util.List;

public class MinMaxView implements Observer {
private ScoreRecord record;
	
	public MinMaxView(ScoreRecord record) {
		this.record = record;
	}
	
	public void displayScores() {
		List<DPScore> scores = record.getScoreRecord();
		int min=101;
		int max=-1;
		for (DPScore score: scores) {
			if (score.getScore()<min) min = score.getScore();
			if (score.getScore()>max) max = score.getScore();
			
		}
		System.out.println("Minimum Score = " + min);
		System.out.println("Maximum Score = " + max);
	}
	
	public void update() {
		displayScores();
	}

}
