package day6_˝ĚąŰĹćĆĐĹĎ_şš˝Ŕ;

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
