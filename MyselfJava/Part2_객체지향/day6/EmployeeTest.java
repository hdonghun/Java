package day6_static����;

public class EmployeeTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee employeeLee = new Employee();
		employeeLee.setEmployeeName("�̹μ�");
		
		System.out.println(employeeLee.getSerialNum());
		
		Employee employeeHan = new Employee();
		employeeHan.setEmployeeName("�ѵ���");
		
		
		//2���� �ν��Ͻ��� �ϳ��� �޸𸮸� �����Ѵ�.
		System.out.println(employeeHan.getEmployeeName()+"���� ����� "+employeeHan.getEmployeeId()+" �Դϴ�.");
		System.out.println(employeeLee.getEmployeeName()+"���� ����� "+employeeLee.getEmployeeId()+" �Դϴ�.");
	}

}
//������ ���� , ���ø޸�, ���޸�
