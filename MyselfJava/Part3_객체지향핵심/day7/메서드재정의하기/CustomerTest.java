package day7_extend_1_�޼����������ϱ�;

public class CustomerTest {
	public static void main(String[] args) {
		
		Customer customerHan = new Customer(10010,"�ѵ���");
		customerHan.bonusPoint = 1000;
		int price = customerHan.calcPrice(1000);
		System.out.println("���ź��: "+price);
		System.out.println(customerHan.showCustomerInfo());
		
		System.out.println();
		
		VIPCustomer customerLee = new VIPCustomer(20010,"�̹μ�");
		customerLee.bonusPoint = 100000;
		price = customerLee.calcPrice(1000);
		System.out.println("���ź��: "+price);
		System.out.println(customerLee.showCustomerInfo());
		
		
		// vc ������ Ÿ���� Customer���� �ν��Ͻ��� Ÿ���� VIPCustomer��
		//�ڹٿ��� �׻� �ν��Ͻ��� �޼��尡 ȣ�� ��(����޼����� ����)
		//�ڹ��� ��� �޼���� ���� �޼���(virtual method)��
		System.out.println();
		Customer vc = new VIPCustomer(12345, "noname");
		vc.calcPrice(1000);
		price = customerLee.calcPrice(1000);
		System.out.println("���ź��: "+ price);
		System.out.println(vc.showCustomerInfo());
		
		//�� ��ȯ (��ĳ����)!
		//�̷��� ��밡��
		// >> Customer customerLee = new VIPCustomer(20010, "�̹μ�");
		// VIPCustomer�� �����Ͽ�����, CustomeŸ���̱� ������ Customer�͸� ����Ҽ��ִ�.
		
		
	}
}
