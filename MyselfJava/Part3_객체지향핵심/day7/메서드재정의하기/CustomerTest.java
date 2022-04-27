package day7_extend_1_메서드재정의하기;

public class CustomerTest {
	public static void main(String[] args) {
		
		Customer customerHan = new Customer(10010,"한동훈");
		customerHan.bonusPoint = 1000;
		int price = customerHan.calcPrice(1000);
		System.out.println("구매비용: "+price);
		System.out.println(customerHan.showCustomerInfo());
		
		System.out.println();
		
		VIPCustomer customerLee = new VIPCustomer(20010,"이민섭");
		customerLee.bonusPoint = 100000;
		price = customerLee.calcPrice(1000);
		System.out.println("구매비용: "+price);
		System.out.println(customerLee.showCustomerInfo());
		
		
		// vc 변수의 타입은 Customer지만 인스턴스의 타입은 VIPCustomer임
		//자바에서 항상 인스턴스의 메서드가 호출 됨(가상메서드의 원리)
		//자바의 모든 메서드는 가상 메서드(virtual method)임
		System.out.println();
		Customer vc = new VIPCustomer(12345, "noname");
		vc.calcPrice(1000);
		price = customerLee.calcPrice(1000);
		System.out.println("구매비용: "+ price);
		System.out.println(vc.showCustomerInfo());
		
		//형 변환 (업캐스팅)!
		//이렇게 사용가능
		// >> Customer customerLee = new VIPCustomer(20010, "이민섭");
		// VIPCustomer로 생성하였지만, Custome타입이기 때문에 Customer것만 사용할수있다.
		
		
	}
}
