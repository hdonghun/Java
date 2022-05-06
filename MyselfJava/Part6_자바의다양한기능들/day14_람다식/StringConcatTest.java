package day14_람다식;

public class StringConcatTest {

	public static void main(String[] args) {
		
		String s1 = "Hello";
		String s2 = "World";
		StringConcatImpl strImpl = new StringConcatImpl();
		strImpl.makeString(s1,s2);
		
		//람다식을 구현하면 익명 내부 클래스가 만들어지고, 이를 통해 익명 객체가 생성됨.
		//내부적으로 익명클래스가 만들어져서 클래스 없이 생성한것처럼 보인다.
		StringConcat concat = (s,v)->System.out.println(s+","+v);
		concat.makeString(s1, s2);
		//람다식 내부에 익명클래스가 쓰인다는거.
		StringConcat concat2 = new StringConcat() {
			@Override
			public void makeString(String s1, String s2) {
				System.out.println(s1+"....."+s2);
			}
		};
		concat2.makeString(s1, s2);
	
	}
	
}
