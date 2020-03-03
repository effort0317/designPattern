package commandPattern;

public class Button {
	// ��ư�� ���� �� �ִ� ��� �Ѱ����� Command �������̽� ��ü��  ����
	private Command command;
	
	// ��� ����, ó�� ����� �����ϰų� ���� �� ���
	public void setCommand(Command command) {
		this.command=command;
	}
	// ��ư�� �������� ��� ����
	public void pressed() {
		command.execute();
	}

	

}
