package commandPattern;

public class Button {
	// 버튼이 가질 수 있는 기능 한가지를 Command 인터페이스 객체로  생성
	private Command command;
	
	// 기능 설정, 처음 기능을 생성하거나 수정 시 사용
	public void setCommand(Command command) {
		this.command=command;
	}
	// 버튼이 눌러지면 기능 실행
	public void pressed() {
		command.execute();
	}

	

}
