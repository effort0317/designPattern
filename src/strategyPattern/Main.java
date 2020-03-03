package strategyPattern;

/* Strategy Pattern이란 전략을 쉽게 바꿀 수 있도록 해주는 패턴이다.
 * 프로젝트를 생성할 시 제일 중요한 것 중 하나는 OCP(Open and Closed Principle)를
 * 위반하지 않는 것이다. 즉, 나중에 전략을 수정할 시  'public static void main(String[] args){}'의
 * 안에 들어있는 코드 외에는 어느 코드도 수정하지 말아야 한다는 뜻이다. 그러나 지금 이 말만 읽어서는 무슨 뜻인지 이해하기가
 * 쉽지 않을 가능성이 있으므로 아래와 같은 예시로 쉽게 Strategy Pattern에 대하여 소개하겠다.
 * 아래 예시는 이동과 공격 기능이 있는 로봇을 생성하는 프로젝트이다. 로봇은 'Robot'이라는 추상 클래스를 이용하여 
 * 생성 할 것이며, 다른 클래스의 내용도 주의 깊게 읽되, 특히 Robot클래스에 있는 내용을 주의 깊게 읽어주시기 바랍니다.
 */

public class Main {

	public static void main(String[] args) {
		// 로봇 'atom'과 'taekwonv' 생성
		Robot atom = new Atom("아톰");
		Robot taekwonv = new TaekwonV("태권브이");
		
		// atom에 이동으로는 'FlyStrategy()'와 공격으로는 'PunchStrategy()'를 추가한다. 
		atom.setMovingstrategy(new FlyStrategy());
		atom.setAttackstrategy(new PunchStrategy());
		// atom 이동 후 공격, 여기에서는 간단히 이동과 공격 기능이 잘 실행된다는 표현으로 
		// System.out.println()을 이용하여 문자 출력을 하겠다.
		atom.move();
		atom.attack();
		
		// taekwonv에 이동으로는  'WalkStrategy()'와 공격으로는 'MissileStrategy()'를 추가한다.
		taekwonv.setMovingstrategy(new WalkStrategy());
		taekwonv.setAttackstrategy(new MissileStrategy());
		// taekwonv 이동 후 공격, 여기에서도 간단히 이동과 공격 기능이 잘 실행된다는 표현으로 
		// System.out.println()을 이용하여 문자 출력을 하겠다.
		taekwonv.move();
		taekwonv.attack();
		
	}

}
