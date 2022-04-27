package day6_ΩÃ±€≈Ê∆–≈œ_∫πΩ¿;

public class Car {
	
	private static int serialNum = 1000;
	private int carNum;
	
	public Car(){
		serialNum++;
		carNum = serialNum;
	}
	
	public int getCarNum() {
		return carNum;
	}
	
	public void setCarNum(int carNum) {
		this.carNum = carNum;
	}
}
