package day8_�������̽������ϱ�_���;

public interface Sell {

	void sell();
	
	default void order() {
		System.out.println("sell order");
	}
}
