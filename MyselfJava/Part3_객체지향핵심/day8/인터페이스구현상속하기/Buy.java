package day8_�������̽������ϱ�_���;

public interface Buy {

	void buy();
	default void order() {
		System.out.println("buy order");
	}
}
