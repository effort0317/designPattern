package observerPattern;

import java.util.List;

// ScoreRecord에 있는 DPScore들 중 최대값과 최소값을 출력해주는 Observer
public class MinMaxView implements Observer {
private ScoreRecord record; // DPScore들을 직접적으로 가져와야 하기 때문에 ScoreRecord를 멤버변수로 삼는다.
	
	public MinMaxView(ScoreRecord record) {
		this.record = record;
	}
	
	public void displayScores() { // 최대/최소값 출력
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
	
	public void update() { // 가장 최근에 업데이트 된 ScoreRecord가 가지고 있는 DPScore들의 최대/최소값을 출력
		displayScores();
	}

}
