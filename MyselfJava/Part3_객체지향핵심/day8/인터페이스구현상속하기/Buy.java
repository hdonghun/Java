package day8_인터페이스구현하기_상속;

public interface Buy {

	void buy();
	default void order() {
		System.out.println("buy order");
	}
}
