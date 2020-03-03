package observerPattern;

import java.util.List;

// DPScore���� ������ִ� Observer
public class DataSheetView implements Observer {
	private ScoreRecord record; // DPScore���� ���������� �����;� �ϱ� ������ ScoreRecord�� ��������� ��´�.
	
	public DataSheetView(ScoreRecord record) {
		this.record = record;
	}
	
	public void displayScores() { // �� ���
		List<DPScore> scores = record.getScoreRecord();
		
		for (DPScore score: scores) {
			System.out.println(score.getName() + "  " +score.getScore());
		}
	}
	
	public void update() { // ���� �ֱٿ� ������Ʈ �� ScoreRecord�� DPScore���� ���� ���
		displayScores();
	}

}
