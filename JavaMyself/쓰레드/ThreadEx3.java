package 쓰레드;

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
// 쓰레드가 새로 생성되지 않았다. 그저 ThreadEx3_1클래스의 run()이 호출되었을 뿐이다. 아래 그림은 main쓰레드의 호출스택이며, main메서드가 포함되어 있음을 확인하자.
