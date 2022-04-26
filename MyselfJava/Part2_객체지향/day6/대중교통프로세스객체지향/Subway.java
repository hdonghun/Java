package day6_버스프로세스객체지향프로그래밍;

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
		System.out.println("지하철 "+lineNumber+"번의 승객 수는 "+passengerCount+"명 이고, 수입은 "+ money+"원 입니다.");
	}


}
