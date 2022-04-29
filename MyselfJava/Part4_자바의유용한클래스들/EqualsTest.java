package day9_ObjectŬ�����Ǹ޼���Ȱ��_toSting_equals;

public class EqualsTest {
	public static void main(String[] args) throws CloneNotSupportedException {
		
		Student std1 = new Student(100,"Han");
		Student std2 = new Student(100,"Han");
		Student std3 = std1; //�ּҰ��� ���� , ���� �ּҸ� ���� �ϴ�.
		
		System.out.println(std1==std2);
		System.out.println(std1.equals(std2)); //�ּҴ� �ٸ�����, �������� ����, �ֳ� �������߱⶧����
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

		//���� ��¥ �ؽ��ڵ� �˾ƺ��¹�
		System.out.println(System.identityHashCode(std1));
		System.out.println(System.identityHashCode(std2));
		System.out.println(System.identityHashCode(std3));
		System.out.println();
		
		std1.setStudentName("Lee");
		Student copyStudent = (Student)std1.clone();
		System.out.println(copyStudent);
	}
	
}
