package day6_ArrayList�����������α׷�;

public class StudentSubjectTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Student studentHan = new Student(1001,"Han");
		studentHan.addSubject("����", 100);
		studentHan.addSubject("����", 100);
		
		Student studentLee = new Student(1002,"Lee");
		studentLee.addSubject("����", 90);
		studentLee.addSubject("����", 86);
		studentLee.addSubject("����", 88);
		
		studentLee.showScoreInfo();
		System.out.println("================");
		studentHan.showScoreInfo();
		
		
	}

}
