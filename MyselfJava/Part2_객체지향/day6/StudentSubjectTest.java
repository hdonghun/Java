package day6_ArrayList성적산출프로그램;

public class StudentSubjectTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Student studentHan = new Student(1001,"Han");
		studentHan.addSubject("국어", 100);
		studentHan.addSubject("수학", 100);
		
		Student studentLee = new Student(1002,"Lee");
		studentLee.addSubject("국어", 90);
		studentLee.addSubject("수학", 86);
		studentLee.addSubject("영어", 88);
		
		studentLee.showScoreInfo();
		System.out.println("================");
		studentHan.showScoreInfo();
		
		
	}

}
