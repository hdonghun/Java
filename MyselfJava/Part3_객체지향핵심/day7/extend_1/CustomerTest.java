package day7_extend_1;

public class CustomerTest {
	public static void main(String[] args) {
		
		Customer customerHan = new Customer(10010,"�ѵ���");
		customerHan.bonusPoint = 1000;
		System.out.println(customerHan.showCustomerInfo());
		
		System.out.println();
		
		VIPCustomer customerLee = new VIPCustomer(20010,"�̹μ�");
		customerLee.bonusPoint = 100000;
		System.out.println(customerLee.showCustomerInfo());
		
		//�� ��ȯ (��ĳ����)!
		//�̷��� ��밡��
		// >> Customer customerLee = new VIPCustomer(20010, "�̹μ�");
		// VIPCustomer�� �����Ͽ�����, CustomeŸ���̱� ������ Customer�͸� ����Ҽ��ִ�.
		
		
	}
}
