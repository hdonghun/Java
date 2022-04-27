package day7_인터페이스;

public class CallculatorTest {

	public static void main(String[] args) {
	//구현상속
	//타입상속
	//인터페이스는 
		int num1 = 10;
		int num2 = 2;
		CompleteCalc calc = new CompleteCalc();
		System.out.println(calc.add(num1, num2));
		System.out.println(calc.substract(num1, num2));
		System.out.println(calc.times(num1, num2));
		System.out.println(calc.divide(num1, num2));

	}

}
