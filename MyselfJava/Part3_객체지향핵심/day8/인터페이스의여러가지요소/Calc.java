package day8_인터페이스의여러가지요소;

public interface Calc {
	
	double PI = 3.14;
	int ERROR = -999999999;
	
	int add(int num1, int num2);
	int substract(int num1, int num2);
	int times(int num1, int num2);
	int divide(int num1, int num2);
	
	default void description() {
		System.out.println("정수의 사칙연산을 제공합니다.");
		myMethod();
	}
	
	static int total(int[] arr) {
		int total = 0;
		for(int num :arr) {
			total += num;
		}
		myStaticMethod();
		return total;
	}
	
	// private 메서드 사용해보기!!!!
	// pirvate 메서드는 재정의 할 수 없다.
	private void myMethod() {
		System.out.println("myMethod");
	}
	private static void myStaticMethod() {
		System.out.println("myStaticMethod");
	}
	
	
	
}
