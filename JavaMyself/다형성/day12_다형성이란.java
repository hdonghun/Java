package ������;

public class day12_�������̶� {}
	
	//����Ŭ���� Ÿ���� ���������� �ڼ�Ŭ������ �ν��Ͻ��� ������ �� �ֵ��� �Ͽ���.
	class Tv{
		boolean power;
		int channel;
		
		void power() {power = !power;}
		void channelUp(){++channel;}
		void channelDown() {--channel;}
	}
	
	class CaptionTv extends Tv{
		String text; //ĸ���� �����ֱ� ���� ���ڿ�
		void caption() {
		}
	}	
		
	class TvTest{
		public static void main(String[] args) {
			
			CaptionTv c = new CaptionTv();
			Tv t = new CaptionTv();
			
			//c.caption();
			//t.  //caption�� ����.
			//�� �� ���� Ÿ���� �ν��Ͻ����� ���� ������ Ÿ�Կ� ���� ����� �� �ִ� ����� ������ �޶�����.
			// ���������� ����� �� �ִ� ����� ������ �ν��Ͻ��� ��� �������� ���ų� ����� �Ѵ�.
			//�׷��� ������ CaptionTv c = new Tv();�� �Ұ��� �ϴ�.
			//��� : ����Ÿ���� ���������� �ڼ�Ÿ���� �ν��Ͻ��� ������ �� �ִ�.
			//		�ݴ�� �ڼ�Ÿ���� ���������� ����Ÿ���� �ν��Ͻ��� ���� �� �� ����.
		}
	}

