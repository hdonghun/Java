package day8_�������̽������ϱ�_���;

public class CustomerTest {
	public static void main(String[] args) {
	
		// �� �������� �ʴ´�...
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
