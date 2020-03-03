package strategyPattern;

/* Strategy Pattern�̶� ������ ���� �ٲ� �� �ֵ��� ���ִ� �����̴�.
 * ������Ʈ�� ������ �� ���� �߿��� �� �� �ϳ��� OCP(Open and Closed Principle)��
 * �������� �ʴ� ���̴�. ��, ���߿� ������ ������ ��  'public static void main(String[] args){}'��
 * �ȿ� ����ִ� �ڵ� �ܿ��� ��� �ڵ嵵 �������� ���ƾ� �Ѵٴ� ���̴�. �׷��� ���� �� ���� �о�� ���� ������ �����ϱⰡ
 * ���� ���� ���ɼ��� �����Ƿ� �Ʒ��� ���� ���÷� ���� Strategy Pattern�� ���Ͽ� �Ұ��ϰڴ�.
 * �Ʒ� ���ô� �̵��� ���� ����� �ִ� �κ��� �����ϴ� ������Ʈ�̴�. �κ��� 'Robot'�̶�� �߻� Ŭ������ �̿��Ͽ� 
 * ���� �� ���̸�, �ٸ� Ŭ������ ���뵵 ���� ��� �е�, Ư�� RobotŬ������ �ִ� ������ ���� ��� �о��ֽñ� �ٶ��ϴ�.
 */

public class Main {

	public static void main(String[] args) {
		// �κ� 'atom'�� 'taekwonv' ����
		Robot atom = new Atom("����");
		Robot taekwonv = new TaekwonV("�±Ǻ���");
		
		// atom�� �̵����δ� 'FlyStrategy()'�� �������δ� 'PunchStrategy()'�� �߰��Ѵ�. 
		atom.setMovingstrategy(new FlyStrategy());
		atom.setAttackstrategy(new PunchStrategy());
		// atom �̵� �� ����, ���⿡���� ������ �̵��� ���� ����� �� ����ȴٴ� ǥ������ 
		// System.out.println()�� �̿��Ͽ� ���� ����� �ϰڴ�.
		atom.move();
		atom.attack();
		
		// taekwonv�� �̵����δ�  'WalkStrategy()'�� �������δ� 'MissileStrategy()'�� �߰��Ѵ�.
		taekwonv.setMovingstrategy(new WalkStrategy());
		taekwonv.setAttackstrategy(new MissileStrategy());
		// taekwonv �̵� �� ����, ���⿡���� ������ �̵��� ���� ����� �� ����ȴٴ� ǥ������ 
		// System.out.println()�� �̿��Ͽ� ���� ����� �ϰڴ�.
		taekwonv.move();
		taekwonv.attack();
		
	}

}
