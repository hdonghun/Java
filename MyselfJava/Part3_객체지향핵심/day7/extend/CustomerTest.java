package day7_extend;

public class CustomerTest {
	public static void main(String[] args) {
		
		Customer customerHan = new Customer();
		customerHan.setCustomerName("«—µø»∆");
		customerHan.setCustomerId(10001);
		customerHan.bonusPoint = 1000;
		System.out.println(customerHan.showCustomerInfo());
		
		VIPCustomer customerLee = new VIPCustomer();
		customerLee.setCustomerName("¿ÃπŒº∑");
		customerLee.setCustomerId(20000);
		customerLee.bonusPoint = 100000;
		System.out.println(customerLee.showCustomerInfo());
		
	}
}
