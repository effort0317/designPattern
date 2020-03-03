package singletonPattern;



/*
 * Singleton Pattern이란 객체를 하나만 생성하고 싶을 때 사용하는 패턴이다. 그래서 아래의 예시는 
 * Singleton Pattern을 이용하여 사용자는 여럿이지만 프린터 객체는 하나만 생성하여 여럿이서 하나의 
 * 프린터를 사용하는 예시이다. Main파일과 UserThread도 중요하지만 제일 중요한 파트는 Printer파일
 * 이므로 Printer파일을 좀 더 집중적으로 읽어주시기 바랍니다.
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
