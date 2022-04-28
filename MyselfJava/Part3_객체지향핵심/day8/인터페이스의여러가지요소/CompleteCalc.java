package day8_인터페이스의여러가지요소;

public class CompleteCalc extends Calculator {

	@Override
	public int times(int num1, int num2) {
		return num1*num2;
	}
	@Override
	public int divide(int num1, int num2) {
		if(num2 ==0)
			return ERROR;
		return num1/num2;
	}
	public void showInfo() {
		System.out.println("모두 구현 했습니다.");
	}

	// 재정의!
	@Override
	public void description() {
		System.out.println("CompleteCalc overriding");
	}

	
}
