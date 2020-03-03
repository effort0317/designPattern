package commandPattern;

/*
 *  이벤트가 발생했을 때 실행될 기능이 다양하면서 변경이 필요한 경우
 *  이벤트를 발생시키는 클래스의 수정없이 재사용하고자 할 때 사용하는 패턴이
 *  Command Pattern이다. Command Pattern은 실행될 기능을
 *  캡슐화함으로써 기능의 실행을 요구하는(이벤트를 발생시키는) 호출자 클래스(Invoker)와
 *  실제 기능을 실행하는 수신자 클래스(Receiver)사이의 의존성을 제거한다.
 *  따라서 실행될 기능의 변경에도 Invoker를 수정없이 그대로 사용할 수 있도록 해준다.
 *  아래 예시는 만능 버튼 객체'button'을 하나 생성하여 button이 여러 기능을 실행할 수 있도록
 *  해준다. 이 프로젝트에서는 모든 클래스의 내용을 다 주의 깊게 읽어주시기 바랍니다.
 */

public class Main {

	public static void main(String[] args) {
		
		// 버튼 생성
		Button button = new Button();
		
		// CarEngineCommand 기능을 생성 후 Car객체를 생성한 후에 
		// button에 기능을 세팅한 후 기능에도 Car객체를 세팅한다. 
        CarEngineCommand carcmd= new CarEngineCommand();
        Car car = new Car();
        button.setCommand(carcmd);
        carcmd.setCar(car);
        
        // 버튼 클릭 시 엔진이 켜지고 꺼짐을 반복한다.
        button.pressed();
        button.pressed();
        button.pressed();
        button.pressed();
        
        
        /*
        // RobotGunCommand 기능을 생성 후 Robot객체를 생성한 후에 
		// button에 기능을 세팅한 후 기능에도 Robot객체를 세팅한다.  
		RobotGunCommand robotcmd = new RobotGunCommand();
		Robot robot = new Robot();
		button.setCommand(robotcmd);
		robotcmd.setRobot(robot);
        
        // 버튼 클릭 시  fireGun이 발사되고 멈춤을 반복한다. 맨 아래 내용도 읽어주시길 바랍니다.
        button.pressed();
        button.pressed();
        button.pressed();
        button.pressed();
        */ 
	}

}
/*
 * 위와 같이 실행 되었으면 하는 기능을 버튼에 세팅시키고 버튼을 클릭하면 그 기능이 실행된다.
 * 이렇게 기능을 변경하고 싶을 시 직접 Button 클래스의 코드를 수정하지 않고(OCP를 위반하지 않고)
 * 기능을 변경시킬 수 있다. 그리고 그 기능이 구현 시키는 대상도 역시나 기능 클래스의 코드를 수정하지 않고
 * 세팅하였다. 여기에서 button이 Invoker가 되며, Car와 Robot이 Receiver가 된다.
 * Invoker입장에서는 Receiver가 아니라 Receiver가 실행 할 기능을 변화시키므로써 Invoker와
 * Receiver사이의 의존성을 제거했다.
*/