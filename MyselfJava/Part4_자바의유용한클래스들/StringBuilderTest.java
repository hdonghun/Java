package day9_String_StringBuilder_StringBuffer_textblock;

public class StringBuilderTest {

	public static void main(String[] args) {
		
		String java = new String("java");
		String android = new String("android");
		
		StringBuilder buffer = new StringBuilder(java);
		System.out.println(System.identityHashCode(buffer));
		buffer.append(android);
		System.out.println(System.identityHashCode(buffer));
		//메모리가 같다.
		//String builder를 사용하자
		
		
		
		String test = buffer.toString();
		System.out.println(test);
	}

}
