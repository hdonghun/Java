package day7_extend_1;

public class VIPCustomer extends Customer{
	


	double salesRatio;
	private String agentID;
	
	//Getters
	public String getAgentID() {
		return agentID;
	}
	
//	public VIPCustomer() {
//		 // super: 자동으로 하위클래스가 상위클래스인스턴스의 참조값을 가지게 된다.!
//		 // 명시적으로 호출을 해줘야 한다.
//		super(0,"no-name");
//		bonusRatio = 0.05;
//		salesRatio = 0.1;
//		customerGrade = "VIP"; //private여서 오류가 난다. 하지만 상속을 받기 위해서, Customer의 private를 protected로 변경해준다.
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
