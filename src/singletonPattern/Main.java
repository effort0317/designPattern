package singletonPattern;



/*
 * Singleton Pattern�̶� ��ü�� �ϳ��� �����ϰ� ���� �� ����ϴ� �����̴�. �׷��� �Ʒ��� ���ô� 
 * Singleton Pattern�� �̿��Ͽ� ����ڴ� ���������� ������ ��ü�� �ϳ��� �����Ͽ� �����̼� �ϳ��� 
 * �����͸� ����ϴ� �����̴�. Main���ϰ� UserThread�� �߿������� ���� �߿��� ��Ʈ�� Printer����
 * �̹Ƿ� Printer������ �� �� ���������� �о��ֽñ� �ٶ��ϴ�.
 */
public class Main {
	private static final int THREAD_NUM = 5;
	public static void main(String[] args) {
		UserThread[] user = new UserThread[THREAD_NUM];
		for (int i=0; i<THREAD_NUM; i++) {
			user[i] = new UserThread((i+1) + "-thread");
			user[i].start();
		}
		

	}

}
