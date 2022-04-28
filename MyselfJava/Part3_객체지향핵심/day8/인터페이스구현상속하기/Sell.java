package day8_인터페이스구현하기_상속;

public interface Sell {

	void sell();
	
	default void order() {
		System.out.println("sell order");
	}
}
