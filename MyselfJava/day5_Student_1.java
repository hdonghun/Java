package Myself_Part2_��ü����;

public class day5_Student_1 {

	public int studentNumber;
	public String studentName;
	public int grade;
	
	public day5_Student_1() {
	}
	
	public day5_Student_1(int studentNumber, String studentName, int grade) {
		this.studentNumber = studentNumber;
		this.studentName = studentName;
		this.grade = grade;
	}
	
	
	public String showStudentInfo() {
		
		return studentName + "�л��� �й��� " + studentNumber+ "�̰�, "+grade+"�г� �Դϴ�.";
				
 }
}
