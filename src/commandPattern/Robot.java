package commandPattern;

// RobotGunCommand�� ���� fireGun�� �߻�ǰų� ���� Robot��ü�� �����ϴ� Ŭ����
public class Robot {
	// ó������ fireGun�� �߻���� �ʴ� ���� �����̴�.
	private boolean gun = false;
	public void fireGun() {
		// fireGun �߻� Ȥ�� ����, ���⿡���� fireGun�� ���¸� ǥ���ϱ� ���� 'System.out.println'��
		// �̿��Ͽ� fireGun�� ���¸� ǥ���Ѵ�. 
		 gun = !gun;
		   if(gun)
		      System.out.println("Gun fires");
		   else 
		      System.out.println("Gun fire stops");
	}

}
