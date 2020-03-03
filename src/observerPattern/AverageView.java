package observerPattern;

import java.util.List;

// ScoreRecord�� �����ϴ� DPScore���� ����� ������ִ� Observer
public class AverageView implements Observer {
    private ScoreRecord record; // DPScore���� ���������� �����;� �ϱ� ������ ScoreRecord�� ��������� ��´�.
	
	public AverageView(ScoreRecord record) {
		this.record = record;
	}
	
	public void displayScores() { // ��հ� ���
		List<DPScore> scores = record.getScoreRecord();
		double total=0.0;
		
		for (DPScore score: scores) {
			total +=score.getScore();
		}
		
		System.out.println("Average of this ScoreRecord = " + total/scores.size());
	}
	
	public void update() { // ���� �ֱٿ� ������Ʈ �� ScoreRecord�� DPScore���� ��հ� ���
		displayScores();
	}

}
