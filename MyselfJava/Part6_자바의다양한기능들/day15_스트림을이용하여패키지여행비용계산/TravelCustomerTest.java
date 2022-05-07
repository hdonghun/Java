package day15_스트림을이용하여패키지여행비용계산;

import java.util.ArrayList;
import java.util.List;

public class TravelCustomerTest {

	public static void main(String[] args) {

		TravelCustomer customerLee = new TravelCustomer("이순신",40,100);
		TravelCustomer customerHan = new TravelCustomer("한동훈",28,80);
		TravelCustomer customerKim = new TravelCustomer("김동민",27,50);
		TravelCustomer customerMin = new TravelCustomer("민섭",17,10);

	
	List<TravelCustomer> customerList = new ArrayList<>();
	customerList.add(customerLee);
	customerList.add(customerHan);
	customerList.add(customerKim);
	customerList.add(customerMin);
	
	System.out.println("고객 명단 출력");
	customerList.stream().map(c->c.getName()).forEach(s->System.out.println(s));
	System.out.println();
	System.out.println("총(합계)여행 비용");
	System.out.println(customerList.stream().mapToInt(c->c.getPrice()).sum());
	System.out.println();
	System.out.println("20세 이상 고객");
	customerList.stream().filter(c->c.getAge()>=20).map(c->c.getName()).sorted().forEach(s->System.out.println(s));
	}
}
