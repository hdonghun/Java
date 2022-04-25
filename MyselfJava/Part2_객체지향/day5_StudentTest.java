package Myself_Part2_객체지향;

public class day5_StudentTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		day5_Student studentHan = new day5_Student(); //인스턴스(생성자를 호출해서)(힙메모리에) > Student 클래스를 기반으로
		studentHan.studentID = 12345;
		studentHan.setStudentName("Han");
		studentHan.address = "대전 서구 도안동";
		studentHan.showStudentInfo();
		
		day5_Student studentLee = new day5_Student();
		studentLee.studentID = 54321;
		studentLee.setStudentName("Lee");
		studentLee.address = "대전 서구 둔산동";
		studentLee.showStudentInfo();
	
		
	}

}
