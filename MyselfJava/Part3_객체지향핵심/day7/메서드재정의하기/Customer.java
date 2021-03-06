package day7_extend_1_메서드재정의하기;
// 오버라이딩(overriding): 상위 클래스에 정의된 메서드의 구현 내용이 하위 클래스에서 구현할 내용과 맞지 않는 경우 하위 클래스에서 동일한 이름의 메서드를 재정의 할 수 있음.
// VIPCustomer 클래스의 calcPrice()는 할인율이 적용되지 않음
// 재정의 하여 구현해야 함

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
	
	//정보 보여주기
	public String showCustomerInfo() {
		return customerName+"님의 등급은"+ customerGrade + "이며, 보너스 포이트는 "+bonusPoint+"입니다. ";
	}
	

}
