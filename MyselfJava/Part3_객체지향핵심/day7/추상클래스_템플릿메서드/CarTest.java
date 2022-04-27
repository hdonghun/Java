package day7_추상클래스_템플릿메서드패턴;

public class CarTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("자동주행 자동차입니다.");
		Car aiCar = new AICar();
		aiCar.run();
		System.out.println();
		
		System.out.println("일반 자동차입니다.");
		Car mCar = new ManualCar();
		mCar.run();
	}

	
}
