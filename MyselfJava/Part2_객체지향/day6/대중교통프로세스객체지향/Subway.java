package day6_�������μ�����ü�������α׷���;

public class Subway {

	int lineNumber;
	int passengerCount;
	int money;
	
	public Subway(int lineNumber) {
		this.lineNumber = lineNumber;
	}

	public void take(int money) {
		this.money += money;
		passengerCount++;
	}
	
	public void showSubwayinfo() {
		System.out.println("����ö "+lineNumber+"���� �°� ���� "+passengerCount+"�� �̰�, ������ "+ money+"�� �Դϴ�.");
	}


}
