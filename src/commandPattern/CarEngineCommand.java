package commandPattern;

// CarEngineCommand, ��ư Ŭ�� �� �ڵ��� ������ ������ ������.
public class CarEngineCommand implements Command {
	// ������ �����ų� ���� �ڵ��� ��ü ����
    private Car car;
    
    // �ڵ��� ��ü ����
    public void setCar(Car car) {
    	this.car=car;
    }
    // ��� ����
	public void execute() {
		car.engine();
	}

}
