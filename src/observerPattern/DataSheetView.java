package observerPattern;

import java.util.List;

// DPScore들을 출력해주는 Observer
public class DataSheetView implements Observer {
	private ScoreRecord record; // DPScore들을 직접적으로 가져와야 하기 때문에 ScoreRecord를 멤버변수로 삼는다.
	
	public DataSheetView(ScoreRecord record) {
		this.record = record;
	}
	
	public void displayScores() { // 값 출력
		List<DPScore> scores = record.getScoreRecord();
		
		for (DPScore score: scores) {
			System.out.println(score.getName() + "  " +score.getScore());
		}
	}
	
	public void update() { // 가장 최근에 업데이트 된 ScoreRecord의 DPScore들의 값을 출력
		displayScores();
	}

}
