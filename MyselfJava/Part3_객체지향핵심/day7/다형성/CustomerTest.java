package day7_다형성;

import java.util.ArrayList;

public class CustomerTest {
	public static void main(String[] args) {
		
		ArrayList<Customer> customerList = new ArrayList<>();
		
		Customer customerA = new Customer(10010, "A");
		Customer customerB = new Customer(10020, "B");
		Customer customerC = new GoldCustomer(10030, "C");
		Customer customerD = new GoldCustomer(10040, "D");
		Customer customerE = new VIPCustomer(10050, "E");
		
		customerList.add(customerA);
		customerList.add(customerB);
		customerList.add(customerC);
		customerList.add(customerD);
		customerList.add(customerE);
		
		for(Customer customer : customerList) {
			System.out.println(customer.showCustomerInfo());
		}
		int price = 10000;
		for(Customer customer : customerList	) {
			int cost = customer.calcPrice(price);
			System.out.println(customer.getCustomerName()+"님이 "+cost+"원 지불하셨습니다.");
			System.out.println(customer.getCustomerName()+"님의 현재 보너스 포인트는 "+customer.bonusPoint+"입니다. ");
		}
		
		

		
	}
}
