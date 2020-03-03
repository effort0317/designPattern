package observerPattern;
/*
 * ObserverPattern�� ��ü�� ���̿��� ��� �� ��ü�� �����Ͱ� ������ �Ǿ��� ��, �̸� �뺸�޾ƾ� �� ��ü�� ���� �� �� 
 * ������ ������ �����̴�. �����Ͱ� ������ �Ǿ������� �����Ͱ� ������ �� ��ü�� �����ϴ� Ŭ������ �ڵ� ������ �ʿ伺�� ����
 * �����Ͱ� ������ �� ��ü�� �̸� �뺸�޾ƾ� �� ��ü ������ �������� �����Ѵ�. �Ƹ� ObserverPattern�� �����ϱ� ���� ����
 * ������ ���� �� �ϳ��� �����Ǿ� �� ���� �а��� ���� ������ �������� ������ ���ɼ��� ���ٰ� �����Ǿ�, �Ʒ� ���ø� ��� �� �� 
 * ���� ������ �� �ֵ��� ���ڴ�. �Ʒ� ���ô� ������ ���� ����(DPScore)��� �� �������� �ѹ��� ��� ���� ScoreRecord�� �����Ѵ�.
 * �׸��� �� ScoreRecord�� �ִ� �������� �پ��� ������� ����� ���ִ� Observer���� �����ϴ� ��, �ٷ� AverageView, DataSheetView,
 * �׸��� MinMaxView�̴�. �׸��� ScoreRecord�� �����ϴ� DPScore���� �߰��� ���ſ� ���� ScoreRecord�� �����Ͱ� ������ �ȴ�.
 */

public class Main {

	public static void main(String[] args) {
		ScoreRecord record = new ScoreRecord();
		Observer dataSheetView = new DataSheetView(record);
		Observer minMaxView = new MinMaxView(record);
		Observer averageView = new AverageView(record);
        record.addObserver(dataSheetView);
        record.addObserver(minMaxView);
        record.addObserver(averageView);
        
		DPScore score1 = new DPScore();
		score1.setName("score1");
		score1.setScore(90);
		
		DPScore score2 = new DPScore();
		score2.setName("score2");
		score2.setScore(70);
		
		DPScore score3 = new DPScore();
		score3.setName("score3");
		score3.setScore(85);
		
		DPScore score4 = new DPScore();
		score4.setName("score4");
		score4.setScore(25);
		
		record.addScore(score1);
		record.addScore(score2);
		record.addScore(score3);
		record.addScore(score4);	
		
		record.removeScore("score1");
	}
}
// �� ���ÿ� ���� DPScore���� ������ �߰�/������ ���� (record��ü�� ������ ���濡 ����) Observer���� ������ ������ �뺸 �޾� ������Ʈ �� ���� ������ ��Ŀ� �°� 
// ����Ѵ�. ���⼭ �߿��� ���� ��ü���� �������� �����ϱ� ���Ͽ� Observer���� ������ Subject��� ScoreRecordŬ������ ���� Ŭ�������� �ǽ��ߴ�. �̷� ���Ͽ�
// ������ ����� ScoreRecord�� �ڵ� ������ �ʿ伺�� ���ݰ�, �� Ŭ�������� �Ѱ��� �ϸ� ó���ؾ��ϴ� Solid ���� ��Ģ �� SRP��Ģ(���� å�� ��Ģ)�� ���״�.
// �׷��� Observer���� ��üȭ ��ü���� DPScore ��ü���� �������� ���Ͽ� ScoreRecord�� ��������� ��Ҵ�. �ڱⰡ ���� ������ ��� �����;��ϴ���, ���⼭��
// �������� ScoreRecordŬ������ ��ü���� �����´ٴ� ���� �����ִ� �����̱⵵ �ϴ�.
