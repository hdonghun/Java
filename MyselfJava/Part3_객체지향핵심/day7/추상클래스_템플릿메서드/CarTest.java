package day7_�߻�Ŭ����_���ø��޼�������;

public class CarTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("�ڵ����� �ڵ����Դϴ�.");
		Car aiCar = new AICar();
		aiCar.run();
		System.out.println();
		
		System.out.println("�Ϲ� �ڵ����Դϴ�.");
		Car mCar = new ManualCar();
		mCar.run();
	}

	
}
