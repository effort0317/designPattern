package templateMethodPattern;

/*
 * templateMethond Pattern�� ��ü�����δ� ������ �κ������� �ٸ� �� �ٸ� �κе���
 * ���� Ŭ�������� ���������ν� �ڵ� �ߺ��� �ּ�ȭ�ϴ� �� ������ ������ �����̴�. �̰͵� ���ó�
 * �ٷ� ���ø� ���� �����ְڴ�.
 */
public class Main {

	public static void main(String[] args) {
		
		Calculator adder = new Adder();
		System.out.println(adder.calculate(10));
		
		Calculator multi = new Multiplier();
		System.out.println(multi.calculate(10));
		
		Calculator evenCalc = new EvenAdder();
		System.out.println(evenCalc.calculate(10));

	}

}
