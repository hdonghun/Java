package day6_ArrayList�����������α׷�;

import java.util.ArrayList;

//1001�й� Lee�� 1002�й� Kim, �� �л��� �ֽ��ϴ�.
//Lee �л��� ����� ���� 2������ �����߰�, Kim�л��� ����, ����, ���� 3������ �����Ͽ����ϴ�.
//Lee �л��� ���� 100��, ���� 50�� �Դϴ�.
//Kim �л��� ���� 70��, ���� 85��, ���� 100���Դϴ�.
//Student�� Subject Ŭ������ ����� ArrayList�� Ȱ���Ͽ� �� �л��� ���� ������ ������ ����ϼ���.


public class Student {
//�����ڷ�������
	int studentId;
	String studentName;
	
	ArrayList<Subject> subjectList;
	
	Student(int studentId, String studentName){ //������!
		this.studentId = studentId;
		this.studentName = studentName;
		
		subjectList = new ArrayList<>();
	}
		
	public void addSubject(String name, int point) {
		Subject subject = new Subject();
		subject.setName(name);
		subject.setScorePoint(point);
		
		subjectList.add(subject);
	}
	
	public void showScoreInfo() {
		int total = 0;
		for(Subject subject : subjectList) {
			total+=subject.getScorePoint();
			System.out.println(studentName+"�л��� "+ subject.getName()+"������ ������ "+subject.getScorePoint()+" �Դϴ�. ");
		}
		
		System.out.println(studentName + "�л��� ������ "+total+"�� �Դϴ�.");
	}
	
}
