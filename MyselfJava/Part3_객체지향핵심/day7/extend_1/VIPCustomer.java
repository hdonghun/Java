package day7_extend_1;

public class VIPCustomer extends Customer{
	


	double salesRatio;
	private String agentID;
	
	//Getters
	public String getAgentID() {
		return agentID;
	}
	
//	public VIPCustomer() {
//		 // super: �ڵ����� ����Ŭ������ ����Ŭ�����ν��Ͻ��� �������� ������ �ȴ�.!
//		 // ��������� ȣ���� ����� �Ѵ�.
//		super(0,"no-name");
//		bonusRatio = 0.05;
//		salesRatio = 0.1;
//		customerGrade = "VIP"; //private���� ������ ����. ������ ����� �ޱ� ���ؼ�, Customer�� private�� protected�� �������ش�.
//		
//		System.out.println("VIPCustomer() call");
//	}
	
	public VIPCustomer(int customerID, String customerName) {
		super(customerID, customerName);
		customerGrade = "VIP";
		bonusRatio = 0.05;
		salesRatio = 0.1;
		System.out.println("VIPCustomer(int, String) call");
	}
	

}
