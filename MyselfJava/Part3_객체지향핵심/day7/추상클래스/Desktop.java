package day7_�߻�Ŭ����;

public class Desktop extends Computer {

	@Override
	public void display() {
		System.out.println("Desktop display");
	}

	@Override
	public void typing() {
		System.out.println("Desktop typing");	
	}
	//���� Ŭ�������� ������ �͵���, ������ �� �� �ִ�.

	@Override
	public void turnoff() {
		System.out.println("Desktop turnOff");
	}
	
	

}
