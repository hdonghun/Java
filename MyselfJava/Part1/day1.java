package Myself_Part1;
//1. �ڷ���(data type) - �Ǽ� ǥ�� //

public class day1 {

	public static void main(String[] args) {
	
		byte bnum = -128;
		
		System.out.println(bnum);
		
		// int num = 12345678900; #���� ���� out of range
		long lNum = 12345678900L;
		
		// 1. �ڷ���(data type) - �Ǽ� ǥ��
		// �ε� �Ҽ��� ���  > ������ ������ ����� ǥ���Ѵ�.
		// �Ǽ� ����ȭ : ������ �ؼ����� ���� �� �ڸ����� ������ ǥ���Ǵ°�.
		// ��ǻ�Ϳ����� �ؼ��� 2 �̹Ƿ� ����ȭ�� �ϰ� �Ǹ� ���� �κ��� ù ���� �ڸ� ���ڴ� �׻� 1��
		// ��) 0.2 ���� 0.4*2**-1 ����ȭ �ϸ� 1.6 **2**-3
		
		double dnum = 3.14; //8����Ʈ
		float fnum = 3.14f; //4����Ʈ
		
		System.out.println(dnum);
		System.out.println(fnum);
		
		// �ε� �Ҽ��� ����� ����
		double ddnum = 1;
		for(int i = 0; i <10000; i++) {
			ddnum = ddnum +0.1;
		}
		System.out.println(ddnum); // 1001.000000000159 �� ��µǾ�����.
		
		System.out.println("--------------------");
		
		
		}
	}