package commandPattern;

// CarEngineCommand�� ���� �� �� ������ �Ѱ� ���� �ڵ��� ��ü�� �����ϴ� Ŭ����
public class Car {
	// ó������ ������ �����ִ� �����̴�.
	private boolean on = false;
	// ���� ���� Ȥ�� ����, ���⿡���� ������ ���¸� ǥ���ϱ� ���� 'System.out.println'��
	// �̿��Ͽ� ������ ���¸� ǥ���Ѵ�. 
	public void engine() {
		 on = !on;
		   if(on)
		      System.out.println("Engine on");
		   else 
		      System.out.println("Engine off");
	}

}
