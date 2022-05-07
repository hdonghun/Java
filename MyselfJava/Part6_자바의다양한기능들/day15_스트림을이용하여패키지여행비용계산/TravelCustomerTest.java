package day15_��Ʈ�����̿��Ͽ���Ű����������;

import java.util.ArrayList;
import java.util.List;

public class TravelCustomerTest {

	public static void main(String[] args) {

		TravelCustomer customerLee = new TravelCustomer("�̼���",40,100);
		TravelCustomer customerHan = new TravelCustomer("�ѵ���",28,80);
		TravelCustomer customerKim = new TravelCustomer("�赿��",27,50);
		TravelCustomer customerMin = new TravelCustomer("�μ�",17,10);

	
	List<TravelCustomer> customerList = new ArrayList<>();
	customerList.add(customerLee);
	customerList.add(customerHan);
	customerList.add(customerKim);
	customerList.add(customerMin);
	
	System.out.println("�� ��� ���");
	customerList.stream().map(c->c.getName()).forEach(s->System.out.println(s));
	System.out.println();
	System.out.println("��(�հ�)���� ���");
	System.out.println(customerList.stream().mapToInt(c->c.getPrice()).sum());
	System.out.println();
	System.out.println("20�� �̻� ��");
	customerList.stream().filter(c->c.getAge()>=20).map(c->c.getName()).sorted().forEach(s->System.out.println(s));
	}
}
