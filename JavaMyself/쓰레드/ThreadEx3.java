package ������;

public class ThreadEx3 {

	public static void main(String[] args) throws Exception{
		ThreadEx3_1 t1 = new ThreadEx3_1();
		t1.run();
	}

}

class ThreadEx3_1 extends Thread{
	public void run() {
		throwException();
	}
	
	public void throwException() {
		try {
			throw new Exception();
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
}
// �����尡 ���� �������� �ʾҴ�. ���� ThreadEx3_1Ŭ������ run()�� ȣ��Ǿ��� ���̴�. �Ʒ� �׸��� main�������� ȣ�⽺���̸�, main�޼��尡 ���ԵǾ� ������ Ȯ������.
