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
		customerGrade = "VIP"; //private���� ������ ����. ������ ����� �ޱ� ���ؼ�, Customer�� private�� protected�� �������ش�.
	}

	public void setAgentID(String agentID) {
		this.agentID = agentID;
	}
}
