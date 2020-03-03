package templateMethodPattern;

/*
 * templateMethond Pattern은 전체적으로는 같으나 부분적으로 다를 때 다른 부분들을
 * 하위 클래스에서 구현함으로써 코드 중복을 최소화하는 데 유용한 디자인 패턴이다. 이것도 역시나
 * 바로 예시를 통해 보여주겠다.
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
