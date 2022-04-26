package day6_참조자료형변수;

public class Student {
//참조자료형변수
	int studentId;
	String studentName;
	
	Subject korea;
	Subject math;
	
	Student(int studentId, String studentName){ //생성자!
		this.studentId = studentId;
		this.studentName = studentName;
		
		korea = new Subject(); //직접 생성을 해줘야 한다 왜?? 멤버변수의 참조자료형을 가져다가 사용할 수 있다?
		math = new Subject(); 	
	}

	public void setKoreaSubject(String name, int score) {
		korea.subjectName = name;
		korea.score = score;
		
	}
	public void setMathSubject(String name, int score) {
		math.subjectName = name;
		math.score = score;
	}
	public void showScoreInfo() {
		int total = korea.score+math.score;
		System.out.println(studentName + "학생의 총점은 "+total+"점 입니다.");
	}
	
}
