package day7_�߻�Ŭ����_���ø��޼�������;

public class AICar extends Car{

	@Override
	public void drive() {
		System.out.println("���� ������ �մϴ�.");
		System.out.println("�ڵ����� ������ ������ �ٲߴϴ�.");
	}

	@Override
	public void stop() {
		System.out.println("��ֹ� �տ��� ������ ����ϴ�.");
	}

	@Override
	public void wiper() {
		// TODO Auto-generated method stub
		
	}
	
	// CarŬ������ �����ΰ� ����, washCar�� �������־� ����Ѵ�!
	@Override
	public void washCar() {
		System.out.println("�ڵ� ������ �մϴ�.");
	}
	
	
}
