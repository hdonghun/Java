package ������;

public class day12_��������������ȯ {}

	// ����Ÿ������������ > �ڼ�Ÿ������������ �� ����ȯ : �ٿ�ĳ����(Down-casting)
	// �ڼ�Ÿ������������ > ����Ÿ������������ �� ����ȯ: ��ĳ����(Up-casting)
	
	// ������������ ����ȯ ���� ĳ��Ʈ�����ڸ� ����ϸ�, ��ȣ()�ȿ� ��ȯ�ϰ��� �ϴ� Ÿ���� �̸�(Ŭ������)�� �����ָ� �ȴ�.
	
	class Car{
		String color;
		int door;
		void drive() {
			System.out.println("dirve, Brrrrrrr~");
			}
		void stop() {
			System.out.println("stop!!!");
			}
	}
	
	class FireEngine extends Car{

		void water() {
			System.out.println("water!!!");
		}
	}
	
	
	class Ambulance extends Car{
		void siren() {
			System.out.println("siren~~~");
			}
	
	public static void main(String[] args) {
		
		Car car = null;
		FireEngine fe = new FireEngine();
		FireEngine fe2 = null;
		
		fe.water();
		car = fe; // car = (Car)fe;���� ����ȯ�� ������ ���´�.
		fe2 = (FireEngine)car;
		fe2.water();
		}
	
}
	// ����ȯ�� ���������� Ÿ���� ��ȯ�ϴ� ������ �ν��Ͻ��� ��ȯ�ϴ� ���� �ƴϱ� ������ ���������� ����ȯ�� �ν��Ͻ��� �ƹ��� ������ ��ġ�� �ʴ´�.
	// ���� ���������� ����ȯ�� ���ؼ�, �����ϰ� �ִ� �ν��Ͻ����� ����� �� �ִ� ����� ����(����)�� �����ϴ� �ͻ��̴�.
	
	// ���� ��Ӱ��迡 �ִ� Ÿ�԰��� ����ȯ�� ��������� �����Ӱ� ����� �� ������, ���������� ����Ű�� �ν��Ͻ��� �ڼ�Ÿ������ ����ȯ�� ������ �ʴ´�.
	// �׷��� ���������� ����Ű�� �ν��Ͻ��� Ÿ���� �����̴��� Ȯ���ϴ� ���� �߿��ϴ�.
	
	