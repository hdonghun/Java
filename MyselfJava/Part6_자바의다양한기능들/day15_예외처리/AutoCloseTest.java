package day15_예외처리;

public class AutoCloseTest {

	public static void main(String[] args) {
		AutoCloseableObj obj = new AutoCloseableObj();
		
		try(obj){
			throw new Exception(); //exception강제로 발생
		}catch(Exception e) {
			System.out.println("exception");
		}
		System.out.println("end");
	}

}
