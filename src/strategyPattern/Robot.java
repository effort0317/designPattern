package strategyPattern;

public abstract class Robot {
	private String name;
	private MovingStrategy movingstrategy; 
	private AttackStrategy attackstrategy;
	public void attack() {
		this.attackstrategy.attack();
	}
	public void move() {
		this.movingstrategy.move();
	}
	
	public Robot(String name) {
		this.name = name;
	}
	
	
	public String getName() {  // generate getter and setter 이용
		return name;
	}
	public void setName(String name) {  // 멤버 변수 생성 시generate getter and setter 이용
		this.name = name;               // 객체 생성 후 이름 변경 시 사용
	}
	

	public MovingStrategy getMovingstrategy() {
		return movingstrategy;
	}
	public void setMovingstrategy(MovingStrategy movingstrategy) {
		this.movingstrategy = movingstrategy;
	}
	
	
	public AttackStrategy getAttackstrategy() {
		return attackstrategy;
	}
	public void setAttackstrategy(AttackStrategy attackstrategy) {
		this.attackstrategy = attackstrategy;
	}
	
	
}
