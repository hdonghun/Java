package day13_람다식;

public class AddTest {

	public static void main(String[] args) {
		
		Add addL = (x, y)->{return x+y;}; // 람다식 구현
		System.out.println(addL.add(2,3));
	}

}
