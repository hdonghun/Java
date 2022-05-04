package 다형성.instanceof연산자_day12;

public class InstanceofTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FireEngine fe = new FireEngine();
		
		if(fe instanceof FireEngine) {
			System.out.println("this is a FireEngine instance.");
		}
		if(fe instanceof Car) {
			System.out.println("This is a Car instance.");
		}
		if(fe instanceof Object) {
			System.out.println("This is an object instance.");
		}
		System.out.println(fe.getClass().getTypeName()); // 클래스의 이름을 출력
		System.out.println("yes");
	}
}
class Car{}
class FireEngine extends Car{}
