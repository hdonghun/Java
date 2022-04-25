package Myself_Part2_객체지향;

public class StudentTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		Student studentHan = new Student(); //인스턴스 > Student 클래스를 기반으로
		studentHan.studentID = 12345;
		studentHan.setStudentName("Han");
		studentHan.address = "대전 서구 도안동";
		studentHan.showStudentInfo();
		
		Student studentLee = new Student();
		studentLee.studentID = 54321;
		studentLee.setStudentName("Lee");
		studentLee.address = "대전 서구 둔산동";
		studentLee.showStudentInfo();
	}

}
