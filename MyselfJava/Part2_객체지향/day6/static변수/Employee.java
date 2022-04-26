package day6_static변수;

public class Employee {

	//Static 변수!
	private static int serialNum = 1000;
	
	private int employeeId;
	private String employeeName;
	private String department;
	
	public Employee() {
		serialNum++;
		employeeId = serialNum;	
	}
	
	
		// Generate Getters and Setters;
	// static Getter!
	public static int getSerialNum() {
		int i = 0; //지역변수
		//인스턴스변수 사용못함// 
		return serialNum; //static 변수
	}
	
	public int getEmployeeId() {
		return employeeId;
	}
	public void setEmployeeId(int employeeId) {
		this.employeeId = employeeId;
	}
	public String getEmployeeName() {
		return employeeName;
	}
	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}
	public String getDepartment() {
		return department;
	}
	public void setDepartment(String department) {
		this.department = department;
	}
	
	
	
}
