package day7_�߻�Ŭ����_���ø��޼�������;

public abstract class Car {

	public abstract void drive();
	public abstract void stop();
	public abstract void wiper();
	
	public void starCar() {
		System.out.println("�õ��� �մϴ�");
	}
	public void turnOff() {
		System.out.println("�õ��� ���ϴ�.");
	}
	
	//���ø��޼��� �̱� ������, ������ ���ƾ��� �͵�, 
	//����Ŭ���������� �����Ǹ� �Ұ����ϰ� ����� ���ؼ�
	// final�� ����Ѵ�.
	public void washCar() {} // �����δ� �ִ� ���� ������ ���, ������ �߻����� �ʴ´�.
	
	final public void run() {
		starCar();
		drive();
		wiper();
		stop();
		turnOff();
		washCar();
	}
}
