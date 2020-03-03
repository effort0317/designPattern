package decoratorPattern;

/*
 * Decorator Pattern�� �⺻ ��ɿ� �ΰ� ��ɵ��� �������� �߰��� �� ������ ������ �����̸�,
 * BufferedReader�� ���� �Ϳ� ���δ�.
 * ���� ������ �ʿ� ���� ���÷� �ٷ� �����ְڴ�. �켱 �⺻ ��ɿ� �ش��ϴ� RoadDisplay�� 
 * �ΰ� ��ɿ� �ش��ϴ� DisplayDecorator�� �ְ�, RoadDisplay�� DisplayDecorator��
 * Display��� ���� Ŭ������ ������ �ִ�. �� ��� Ŭ�������� ������ ���⼭�� Display��� �� ���� ���̴�.
 * �׸��� DisplayDecorator���� ��üȭ ��ü���� �����Ͽ� �������� RoadDisplay�� �߰����ش�.
 */

public class Main {

	public static void main(String[] args) {
		Display roadDisplay = new RoadDisplay();
		roadDisplay.draw();
		
		Display roadDisplayWithLane = new LaneDecorator(roadDisplay);
		roadDisplayWithLane.draw();
		
		Display roadDisplayWithTraffic = new TrafficDecorator(roadDisplayWithLane);
		roadDisplayWithTraffic.draw();
	}
}
/*
* �׷��� ���⼭ �ǹ��� ���� �� �ִ� ���� �ϳ� �ִ�. ���� �ΰ� ��ɵ��� �⺻ ��ɿ� �߰��Ѵٰ� �����Ͽ��µ� , 
* ���⼭�� DisplayDecorator�� Display�� ��� ������ �����Ͽ� �����Ͽ���. 
* ������ �̷� �����ٴ� �׳� �⺻ ��ɿ� �ΰ���ɵ��� �������� �߰��Ͽ� �����ϴ� ����� ������ �ξ����� �ϴ� ����
* ���� �� �� �ִ� �亯�̴�.  
*/