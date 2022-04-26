package day6_static변수;

public class EmployeeTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee employeeLee = new Employee();
		employeeLee.setEmployeeName("이민섭");
		
		System.out.println(employeeLee.getSerialNum());
		
		Employee employeeHan = new Employee();
		employeeHan.setEmployeeName("한동훈");
		
		
		//2개의 인스턴스가 하나의 메모리를 공유한다.
		System.out.println(employeeHan.getEmployeeName()+"님의 사번은 "+employeeHan.getEmployeeId()+" 입니다.");
		System.out.println(employeeLee.getEmployeeName()+"님의 사번은 "+employeeLee.getEmployeeId()+" 입니다.");
	}

}
//데이터 영역 , 스택메모리, 힙메모리
