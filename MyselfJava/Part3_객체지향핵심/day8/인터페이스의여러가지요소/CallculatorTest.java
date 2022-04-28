package day8_인터페이스의여러가지요소;

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

		calc.description();

		
		int[] arr = {1,2,3,4,5};
		// static메서드이기 떄문에 인터페이스 이름으로 바로 호출해서 사용해도 된다.
		System.out.println(Calc.total(arr));
	}

}
