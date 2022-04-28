package day8_인터페이스구현하기_상속;

public class CustomerTest {
	public static void main(String[] args) {
	
		// 다 오픈하지 않는다...
		Customer customer = new Customer();
		customer.buy();
		customer.sell();
		customer.order();
		customer.hello();
		
		Buy buyer = customer;
		buyer.buy();
		buyer.order();
		
		Sell seller = customer;
		seller.sell();
		seller.order();
	}
}
