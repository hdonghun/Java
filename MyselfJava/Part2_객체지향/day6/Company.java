package day6_�̱�������;

public class Company {
	
	//������ ��ü //�ܺο��� ��� �����ϰ� �� ������ֱ�
	private static Company instance=new Company();
	
	private Company() {
	}
	
	// �ܺο��� ������ ���� ����, ���ο� private�� �ϳ� �����Ǿ� �ְ�, ��(getInstance)�޼��常 �����Ǳ� ������, �� �޼���� 
	// �̱��� ����! ���ذ�...
	public static Company getInstance() {
		if(instance==null) {
			instance = new Company();
		}
		return instance;
	}
	
	
}
