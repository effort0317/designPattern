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
	
	
	public String getName() {  // generate getter and setter �̿�
		return name;
	}
	public void setName(String name) {  // ��� ���� ���� ��generate getter and setter �̿�
		this.name = name;               // ��ü ���� �� �̸� ���� �� ���
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
