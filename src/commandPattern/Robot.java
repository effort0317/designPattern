package commandPattern;

public class Robot {
	private boolean gun = false;
	public void fireGun() {
		 gun = !gun;
		   if(gun)
		      System.out.println("Gun fires");
		   else 
		      System.out.println("Gun fire stops");
	}

}
