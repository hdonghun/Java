package day7_������;
// �������̵�(overriding): ���� Ŭ������ ���ǵ� �޼����� ���� ������ ���� Ŭ�������� ������ ����� ���� �ʴ� ��� ���� Ŭ�������� ������ �̸��� �޼��带 ������ �� �� ����.
// VIPCustomer Ŭ������ calcPrice()�� �������� ������� ����
// ������ �Ͽ� �����ؾ� ��

public class Customer {
	
	protected int customerID;
	protected String customerName;
	protected String customerGrade;
	int bonusPoint;
	double bonusRatio;
	
//	public Customer() {
//		customerGrade = "SILVER";
//		bonusRatio = 0.01;
//		System.out.println("Customer() call");
//	}
	public Customer(int customerID, String customerName) {
		this.customerID = customerID;
		this.customerName = customerName;
		
		customerGrade = "SILVER";
		bonusRatio = 0.01;
		}
	
	
	public int calcPrice(int price) {
		bonusPoint += price * bonusRatio;
		return price;
	}
	
	//Getters and Setters
	public int getCustomerId() {
		return customerID;
	}
	public void setCustomerId(int customerId) {
		this.customerID = customerID;
	}
	public String getCustomerName() {
		return customerName;
	}
	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}
	public String getCustomerGrade() {
		return customerGrade;
	}
	public void setCustomerGrade(String customerGrade) {
		this.customerGrade = customerGrade;
	}
	
	//���� �����ֱ�
	public String showCustomerInfo() {
		return customerName+"���� �����"+ customerGrade + "�̸�, ���ʽ� ����Ʈ�� "+bonusPoint+"�Դϴ�. ";
	}
	

}
