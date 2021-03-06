package day9_Object클래스의메서드활용_toSting_equals;

public class Student implements Cloneable {
	
	private int studentNum;
	private String studentName;
	
	public Student(int studentNum, String studentName) {
		this.studentName = studentName;
		this.studentNum = studentNum;
		
	}
	
	public void setStudentName(String name) {
		this.studentName = name;
	}
	
	public String toString() {
		return studentNum+","+studentName;
	}
	

	@Override
	protected Object clone() throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		return super.clone();
	}

	@Override
	public int hashCode() {
		// TODO Auto-generated method stub
		return studentNum;
	}

	@Override
	public boolean equals(Object obj) {
		
		if(obj instanceof Student) {
			Student std = (Student)obj; //다운캐스팅
			if(this.studentNum == std.studentNum) {
				return true;
			}else {
				return false;
			}
	
		}
		return false;
	}
	
}

