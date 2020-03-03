package singletonPattern;

/*
 * ��� 3 : Initialization on demand holder idiom
 * ���� Ŭ������ �̿��ϴ� ������� ������ ���� ��õ�ϸ� �� ���� Singleton Pattern ����̴�.
 * ���ó� ���� �����忡�� �߻��� �� �ִ� �������� �ذ��� �� ������, ��� 1�� 2�� ���� ��쿡�� 
 * ������Ʈ�� ����Ǵ� ���ÿ�  'getPrinter()'�޼��带 �����Ű�� �ʾҴ� �ϴ���
 * 'private static Printer printer = new Printer();'�� 
 * 'private static Printer printer = null;'�� �κ��� �ٷ� �޸𸮸� ��ƸԴ� 
 * ��Ȳ�� �������Ƿ�, ���3�� ��쿡�� ���� Ŭ������ �̿��Ͽ� �̷��� ��Ȳ�� �Ͼ�� �ʰ� ���ش�. 
*/

public class Printer {
	private Printer() {}
	
	// ���� Ŭ���� LazyHolder
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
 * ��� 2 : �ν��Ͻ��� ����� �޼��忡 ����ȭ�ϴ� ���

public class Printer {
	private static Printer printer = null;
	private Printer() {}
	// �ν��Ͻ��� ����� ���� �޼���'getPrinter()'�� ����ȭ
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
 * ��� 1 : ���� ������ �ν��Ͻ��� ����� �ٷ� �ʱ�ȭ�ϴ� ���

public class Printer {
    // ���� ������ �ν��Ͻ� ���� �� �ٷ� �ʱ�ȭ
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
 * �߸��� Singleton Pattern �ڵ�, ���� �������� ��� ù��° �����尡 getPrinter()�޼ҵ���
 * if(printer == null)�� ���� �� 'printer = new Printer()'�� ���� �� ���ÿ� ������ 
 * ������ �� �Ϻΰ� if(printer == null)�� �����Ѵٸ� �翬�� printer��ü�� ���� null�� ���� ���̰�
 * ���ο� printer��ü�� �� �����ϰ� �Ǿ� ���������� ��ü�� 2�� �̻��� �����ǰ� �Ǹ鼭 Singleton Pattern�� 
 * ������ ������� �ȴ�.  
 
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