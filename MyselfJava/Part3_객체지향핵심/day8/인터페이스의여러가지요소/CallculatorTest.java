package day8_�������̽��ǿ����������;

public class CallculatorTest {

	public static void main(String[] args) {
	//�������
	//Ÿ�Ի��
	//�������̽��� 
		int num1 = 10;
		int num2 = 2;
		CompleteCalc calc = new CompleteCalc();
		System.out.println(calc.add(num1, num2));
		System.out.println(calc.substract(num1, num2));
		System.out.println(calc.times(num1, num2));
		System.out.println(calc.divide(num1, num2));

		calc.description();

		
		int[] arr = {1,2,3,4,5};
		// static�޼����̱� ������ �������̽� �̸����� �ٷ� ȣ���ؼ� ����ص� �ȴ�.
		System.out.println(Calc.total(arr));
	}

}
