package strategyPattern;

/*
 * �κ��� ����� �߻� Ŭ���� 'Robot'�̴�. 
 * �̵��� ���ݱ���� 'Robot'�� ��üȭ ��ü���� ���� ������ �ʰ� �������̽��� ����Ͽ�
 * MainŬ������ 'public static void main(String[] args){}'���� ������ ������
 * ���߿� �̵� Ȥ�� ���� ����� ������ �� 'Robot'�� ��üȭ ��ü�� �ڵ带 �����ؾ��ϴ� OCP������ 
 * �����ϱ� ���ؼ��̴�. �̷� ���Ͽ� ������ ������ �� OCP������ ���� �����鼭 ������ ���� ������ �� �ְ� �ȴ�. 
 */

public abstract class Robot {
	
	private String name;
	// 'Robot'Ŭ������ �������̽� ��ü�� 'movingstrategy'�� 'attackstrategy' ����
	private MovingStrategy movingstrategy; 
	private AttackStrategy attackstrategy;

	public Robot(String name) {
		this.name = name;
	}
	
	// 'Robot'�� ���� ���, attackstrategy������ ���� ����� �̿��Ѵ�. 
	public void attack() {
		this.attackstrategy.attack();
	}
	// 'Robot'�� �̵� ���, movingstrategy������ �̵� ����� �̿��Ѵ�.
	public void move() {
		this.movingstrategy.move();
	}
	
	public String getName() { 
		return name;
	}
	public void setName(String name) {  // ��ü ���� �� �̸� ���� �� ���
		this.name = name;               
	}
	
	public MovingStrategy getMovingstrategy() {
		return movingstrategy;
	}
	// �̵� ��� ����
	public void setMovingstrategy(MovingStrategy movingstrategy) {
		this.movingstrategy = movingstrategy;
	}
	
	public AttackStrategy getAttackstrategy() {
		return attackstrategy;
	}
	// ���� ��� ����
	public void setAttackstrategy(AttackStrategy attackstrategy) {
		this.attackstrategy = attackstrategy;
	}
	
}
