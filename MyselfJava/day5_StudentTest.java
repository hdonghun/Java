package Myself_Part2_��ü����;

public class day5_StudentTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		day5_Student studentHan = new day5_Student(); //�ν��Ͻ�(�����ڸ� ȣ���ؼ�)(���޸𸮿�) > Student Ŭ������ �������
		studentHan.studentID = 12345;
		studentHan.setStudentName("Han");
		studentHan.address = "���� ���� ���ȵ�";
		studentHan.showStudentInfo();
		
		day5_Student studentLee = new day5_Student();
		studentLee.studentID = 54321;
		studentLee.setStudentName("Lee");
		studentLee.address = "���� ���� �л굿";
		studentLee.showStudentInfo();
	
		
	}

}
