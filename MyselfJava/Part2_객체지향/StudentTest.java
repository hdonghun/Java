package Myself_Part2_��ü����;

public class StudentTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		Student studentHan = new Student(); //�ν��Ͻ� > Student Ŭ������ �������
		studentHan.studentID = 12345;
		studentHan.setStudentName("Han");
		studentHan.address = "���� ���� ���ȵ�";
		studentHan.showStudentInfo();
		
		Student studentLee = new Student();
		studentLee.studentID = 54321;
		studentLee.setStudentName("Lee");
		studentLee.address = "���� ���� �л굿";
		studentLee.showStudentInfo();
	}

}
