package commandPattern;

// RobotGunCommand를 통해 fireGun이 발사되거나 멈출 Robot객체를 생성하는 클래스
public class Robot {
	// 처음에는 fireGun이 발사되지 않는 멈춤 상태이다.
	private boolean gun = false;
	public void fireGun() {
		// fireGun 발사 혹은 멈춤, 여기에서는 fireGun의 상태를 표현하기 위해 'System.out.println'을
		// 이용하여 fireGun의 상태를 표현한다. 
		 gun = !gun;
		   if(gun)
		      System.out.println("Gun fires");
		   else 
		      System.out.println("Gun fire stops");
	}

}
