package day7_추상클래스_템플릿메서드패턴;

public abstract class Car {

	public abstract void drive();
	public abstract void stop();
	public abstract void wiper();
	
	public void starCar() {
		System.out.println("시동을 켭니다");
	}
	public void turnOff() {
		System.out.println("시동을 끕니다.");
	}
	
	//템플릿메서드 이기 때문에, 변하지 말아야할 것들, 
	//하위클래스에서도 재정의를 불가능하게 만들기 위해서
	// final을 사용한다.
	public void washCar() {} // 구현부는 있는 구현 내용이 없어서, 오류가 발생하지 않는다.
	
	final public void run() {
		starCar();
		drive();
		wiper();
		stop();
		turnOff();
		washCar();
	}
}
