package observerPattern;

import java.util.List;

// ScoreRecord�� �ִ� DPScore�� �� �ִ밪�� �ּҰ��� ������ִ� Observer
public class MinMaxView implements Observer {
private ScoreRecord record; // DPScore���� ���������� �����;� �ϱ� ������ ScoreRecord�� ��������� ��´�.
	
	public MinMaxView(ScoreRecord record) {
		this.record = record;
	}
	
	public void displayScores() { // �ִ�/�ּҰ� ���
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
	
	public void update() { // ���� �ֱٿ� ������Ʈ �� ScoreRecord�� ������ �ִ� DPScore���� �ִ�/�ּҰ��� ���
		displayScores();
	}

}
