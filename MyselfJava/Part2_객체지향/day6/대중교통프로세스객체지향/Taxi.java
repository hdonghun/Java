package day6_�������μ�����ü�������α׷���;
//���� �������� Edward�� ������ �ؼ� �ýø� Ÿ�� �߽��ϴ�.
//20000���� ������ �־��µ� 10000���� �ýú�� ����߽��ϴ�.
//�ýô� '�߳����� ���'ȸ�� �ýø� �����ϴ�.
//��¹� : Edward���� ���� ���� 10000���Դϴ�.
//�� ���� ����ý� ������ 10000�� �Դϴ�.


	public class Taxi {
	
		String taxiCompanyName;
		int money;


		public Taxi(String taxiCompanyName) {
			this.taxiCompanyName = taxiCompanyName;
		}
		
		public void take(int money) {
			this.money += money;
		}

		public void showTaxiinfo() {
			System.out.println(taxiCompanyName+"�� �ý� ������ "+money+"�� �Դϴ�.");
		}
}
