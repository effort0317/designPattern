package observerPattern;
/*
 * ObserverPattern은 객체들 사이에서 어느 한 객체의 데이터가 변경이 되었을 시, 이를 통보받아야 할 객체가 존재 할 시 
 * 유용한 디자인 패턴이다. 데이터가 변경이 되었음에도 데이터가 변경이 된 객체를 생산하는 클래스의 코드 수정할 필요성을 없애
 * 데이터가 변경이 된 객체와 이를 통보받아야 할 객체 사이의 의존성을 제거한다. 아마 ObserverPattern은 이해하기 쉽지 않은
 * 디자인 패턴 중 하나라 생각되어 위 글을 읽고서는 무슨 뜻인지 이해하지 못했을 가능성이 높다고 생각되어, 아래 예시를 들어 좀 더 
 * 쉽게 이해할 수 있도록 돕겠다. 아래 예시는 디자인 패턴 점수(DPScore)들과 이 점수들을 한번에 모아 놓은 ScoreRecord가 존재한다.
 * 그리고 이 ScoreRecord에 있는 점수들을 다양한 방식으로 출력을 해주는 Observer들이 존재하는 데, 바로 AverageView, DataSheetView,
 * 그리고 MinMaxView이다. 그리고 ScoreRecord에 존재하는 DPScore들의 추가와 제거에 따라 ScoreRecord의 데이터가 변경이 된다.
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
// 위 예시와 같이 DPScore들의 값들의 추가/삭제에 따라 (record객체의 데이터 변경에 따라) Observer들이 데이터 변경을 통보 받아 업데이트 된 값을 각각의 방식에 맞게 
// 출력한다. 여기서 중요한 점은 객체간의 의존성을 제거하기 위하여 Observer들의 관리를 Subject라는 ScoreRecord클래스의 상위 클래스에서 실시했다. 이로 인하여
// 데이터 변경시 ScoreRecord의 코드 변경의 필요성을 없앴고, 각 클래스들은 한가지 일만 처리해야하는 Solid 설계 원칙 중 SRP원칙(단일 책임 원칙)도 지켰다.
// 그러나 Observer들의 실체화 객체들은 DPScore 객체들을 가져오기 위하여 ScoreRecord를 멤버변수로 삼았다. 자기가 얻을 정보를 어디서 가져와야하는지, 여기서는
// 점수들은 ScoreRecord클래스의 객체에서 가져온다는 것을 보여주는 예시이기도 하다.
