package day7_extend_1;

public class CustomerTest {
	public static void main(String[] args) {
		
		Customer customerHan = new Customer(10010,"한동훈");
		customerHan.bonusPoint = 1000;
		System.out.println(customerHan.showCustomerInfo());
		
		System.out.println();
		
		VIPCustomer customerLee = new VIPCustomer(20010,"이민섭");
		customerLee.bonusPoint = 100000;
		System.out.println(customerLee.showCustomerInfo());
		
		//형 변환 (업캐스팅)!
		//이렇게 사용가능
		// >> Customer customerLee = new VIPCustomer(20010, "이민섭");
		// VIPCustomer로 생성하였지만, Custome타입이기 때문에 Customer것만 사용할수있다.
		
		
	}
}
