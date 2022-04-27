package day7_extend;

public class VIPCustomer extends Customer{
	
	int bonusPoint;
	double bonusRatio;
	
	double salesRatio;
	private String agentID;
	
	//Getters and Setters
	public String getAgentID() {
		return agentID;
	}
	
	public VIPCustomer() {
		bonusRatio = 0.05;
		salesRatio = 0.1;
		customerGrade = "VIP"; //private여서 오류가 난다. 하지만 상속을 받기 위해서, Customer의 private를 protected로 변경해준다.
	}

	public void setAgentID(String agentID) {
		this.agentID = agentID;
	}
}
