package day7_추상클래스;

public class Desktop extends Computer {

	@Override
	public void display() {
		System.out.println("Desktop display");
	}

	@Override
	public void typing() {
		System.out.println("Desktop typing");	
	}
	//상위 클래스에서 정의한 것들을, 재정의 할 수 있다.

	@Override
	public void turnoff() {
		System.out.println("Desktop turnOff");
	}
	
	

}
