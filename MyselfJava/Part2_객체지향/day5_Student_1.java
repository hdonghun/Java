package Myself_Part2_객체지향;

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
		
		return studentName + "학생의 학번은 " + studentNumber+ "이고, "+grade+"학년 입니다.";
				
 }
}
