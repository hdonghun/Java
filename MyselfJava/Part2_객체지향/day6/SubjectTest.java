package day6_참조자료형변수;

public class SubjectTest {
	public static void main(String[] args) {
		
		Student studentHan = new Student(100, "Han");
		studentHan.setKoreaSubject("국어", 100);
		studentHan.setMathSubject("수학", 100);
		
		Student studentLee = new Student(200,"Lee");
		studentLee.setKoreaSubject("국어", 90);
		studentLee.setMathSubject("수학", 90);
		
		studentHan.showScoreInfo();
		studentLee.showScoreInfo();
		get
	}
}
