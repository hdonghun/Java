package day6_�����ڷ�������;

public class Student {
//�����ڷ�������
	int studentId;
	String studentName;
	
	Subject korea;
	Subject math;
	
	Student(int studentId, String studentName){ //������!
		this.studentId = studentId;
		this.studentName = studentName;
		
		korea = new Subject(); //���� ������ ����� �Ѵ� ��?? ��������� �����ڷ����� �����ٰ� ����� �� �ִ�?
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
		System.out.println(studentName + "�л��� ������ "+total+"�� �Դϴ�.");
	}
	
}
