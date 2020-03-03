package observerPattern;

import java.util.List;

// ScoreRecord에 존재하는 DPScore들의 평균을 출력해주는 Observer
public class AverageView implements Observer {
    private ScoreRecord record; // DPScore들을 직접적으로 가져와야 하기 때문에 ScoreRecord를 멤버변수로 삼는다.
	
	public AverageView(ScoreRecord record) {
		this.record = record;
	}
	
	public void displayScores() { // 평균값 출력
		List<DPScore> scores = record.getScoreRecord();
		double total=0.0;
		
		for (DPScore score: scores) {
			total +=score.getScore();
		}
		
		System.out.println("Average of this ScoreRecord = " + total/scores.size());
	}
	
	public void update() { // 가장 최근에 업데이트 된 ScoreRecord의 DPScore들의 평균값 출력
		displayScores();
	}

}
