package day7_추상클래스;

public abstract class Computer {
	
	public abstract void display();
	public abstract void typing();
	
	public void turnOn() {
		System.out.println("전원을 켭니다. ");
	}
	
	public void turnoff() {
		System.out.println("전원을 끕니다. ");
	}
}
