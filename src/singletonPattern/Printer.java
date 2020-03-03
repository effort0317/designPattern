package singletonPattern;

/*
 * 방법 3 : Initialization on demand holder idiom
 * 내부 클래스를 이용하는 방법으로 본인이 제일 추천하며 잘 쓰는 Singleton Pattern 기법이다.
 * 역시나 다중 스레드에서 발생할 수 있는 문제점을 해결할 수 있으며, 방법 1과 2와 같은 경우에는 
 * 프로젝트가 실행되는 동시에  'getPrinter()'메서드를 실행시키지 않았다 하더라도
 * 'private static Printer printer = new Printer();'과 
 * 'private static Printer printer = null;'의 부분이 바로 메모리를 잡아먹는 
 * 상황이 벌어지므로, 방법3의 경우에는 내부 클래스를 이용하여 이러한 상황이 일어나지 않게 해준다. 
*/

public class Printer {
	private Printer() {}
	
	// 내부 클래스 LazyHolder
	private static class LazyHolder {
		public static final Printer printer = new Printer();
	}
	public static Printer getPrinter() {
		return LazyHolder.printer;
	}
	public void print(String str) {
		System.out.println(str);	
	}

}
 

/*
 * 방법 2 : 인스턴스를 만드는 메서드에 동기화하는 방법

public class Printer {
	private static Printer printer = null;
	private Printer() {}
	// 인스턴스를 만드는 정적 메서드'getPrinter()'를 동기화
	public synchronized static Printer getPrinter() {
		if(printer == null){
			printer = new Printer();
		}
		return printer;
	}
	public void print(String str) {
		System.out.println(str);	
	}

}
 */


/*
 * 방법 1 : 정적 변수에 인스턴스를 만들어 바로 초기화하는 방법

public class Printer {
    // 정적 변수에 인스턴스 생성 후 바로 초기화
	private static Printer printer = new Printer();
	private Printer() {}
	
	public static Printer getPrinter() {
		return printer;
	}
	public void print(String str) {
		System.out.println(str);	
	}

}
 */


/*
 * 잘못된 Singleton Pattern 코딩, 다중 스레드의 경우 첫번째 스레드가 getPrinter()메소드의
 * if(printer == null)을 실행 후 'printer = new Printer()'의 실행 전 동시에 나머지 
 * 스레드 중 일부가 if(printer == null)을 실행한다면 당연히 printer객체의 값은 null로 나올 것이고
 * 새로운 printer객체를 더 생성하게 되어 최종적으로 객체가 2개 이상이 생성되게 되면서 Singleton Pattern의 
 * 목적이 사라지게 된다.  
 
public class Printer {
	private static Printer printer = null;
	private Printer() {}
	
	public static Printer getPrinter() {
		if(printer == null) {
			printer = new Printer();
		}
	return printer;
	}
	public void print(String str) {
		System.out.println(str);
		
	}
}
*/