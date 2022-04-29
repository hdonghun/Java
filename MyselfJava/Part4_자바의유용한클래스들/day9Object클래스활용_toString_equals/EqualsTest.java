package day9_Object클래스의메서드활용_toSting_equals;

public class EqualsTest {
	public static void main(String[] args) throws CloneNotSupportedException {
		
		Student std1 = new Student(100,"Han");
		Student std2 = new Student(100,"Han");
		Student std3 = std1; //주소값만 복사 , 같은 주소를 갖게 하는.
		
		System.out.println(std1==std2);
		System.out.println(std1.equals(std2)); //주소는 다르지만, 논리적으로 같다, 왜냐 재정의했기때문에
		System.out.println();
		
		System.out.println(std1 ==std3);
		System.out.println(std1.equals(std3));
		System.out.println();
		
		System.out.println(std1.hashCode());
		System.out.println(std2.hashCode());
		System.out.println(std3.hashCode());
		System.out.println();
		
		String str1 = new String("abc");
		String str2	= new String("abc");
		
		System.out.println(str1.equals(str2));

		System.out.println(str1.hashCode());
		System.out.println(str2.hashCode());
		System.out.println();

		Integer i = 100;
		System.out.println(i.hashCode());
		
		System.out.println();

		//원래 진짜 해쉬코드 알아보는법
		System.out.println(System.identityHashCode(std1));
		System.out.println(System.identityHashCode(std2));
		System.out.println(System.identityHashCode(std3));
		System.out.println();
		
		std1.setStudentName("Lee");
		Student copyStudent = (Student)std1.clone();
		System.out.println(copyStudent);
	}
	
}
