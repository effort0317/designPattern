package observerPattern;

public class Main {

	public static void main(String[] args) {
		ScoreRecord record = new ScoreRecord();
        DataSheetView dataView = new DataSheetView(record); // Observer를 추상클라스로 만들었을 시 Observer o = new DataSheetView(record); 
        MinMaxView minMaxView = new MinMaxView(record);
        AverageView averageView = new AverageView(record);
        record.addObserver(dataView);
        record.addObserver(minMaxView);
        record.addObserver(averageView);
        
		DPScore score1 = new DPScore();
		score1.setName("insang1");
		score1.setScore(90);
		
		DPScore score2 = new DPScore();
		score2.setName("insang2");
		score2.setScore(70);
		
		DPScore score3 = new DPScore();
		score3.setName("insang3");
		score3.setScore(85);
		
		DPScore score4 = new DPScore();
		score4.setName("insang4");
		score4.setScore(25);
		
		record.addScore(score1);
		record.addScore(score2);
		record.addScore(score3);
		record.addScore(score4);
		
	   //DataSheetView dsv = new DataSheetView(record);
       // dsv.displayScores();	
		
		record.removeScore("insang1");
	}

}
