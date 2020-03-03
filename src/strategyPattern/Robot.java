package strategyPattern;

/*
 * 로봇을 만드는 추상 클래스 'Robot'이다. 
 * 이동과 공격기능을 'Robot'의 구체화 객체에서 직접 만들지 않고 인터페이스를 사용하여
 * Main클래스의 'public static void main(String[] args){}'에서 설정한 이유는
 * 나중에 이동 혹은 공격 기능을 수정할 시 'Robot'의 구체화 객체의 코드를 수정해야하는 OCP위반을 
 * 방지하기 위해서이다. 이로 인하여 전략을 수정할 시 OCP위반을 하지 않으면서 전략을 쉽게 수정할 수 있게 된다. 
 */

public abstract class Robot {
	
	private String name;
	// 'Robot'클래스에 인터페이스 객체인 'movingstrategy'와 'attackstrategy' 생성
	private MovingStrategy movingstrategy; 
	private AttackStrategy attackstrategy;

	public Robot(String name) {
		this.name = name;
	}
	
	// 'Robot'의 공격 기능, attackstrategy에서의 공격 기능을 이용한다. 
	public void attack() {
		this.attackstrategy.attack();
	}
	// 'Robot'의 이동 기능, movingstrategy에서의 이동 기능을 이용한다.
	public void move() {
		this.movingstrategy.move();
	}
	
	public String getName() { 
		return name;
	}
	public void setName(String name) {  // 객체 생성 후 이름 변경 시 사용
		this.name = name;               
	}
	
	public MovingStrategy getMovingstrategy() {
		return movingstrategy;
	}
	// 이동 기능 설정
	public void setMovingstrategy(MovingStrategy movingstrategy) {
		this.movingstrategy = movingstrategy;
	}
	
	public AttackStrategy getAttackstrategy() {
		return attackstrategy;
	}
	// 공격 기능 설정
	public void setAttackstrategy(AttackStrategy attackstrategy) {
		this.attackstrategy = attackstrategy;
	}
	
}
