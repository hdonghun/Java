package day6_�������μ�����ü�������α׷���;

public class TakeTransTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student studentJ = new Student("James",5000);
		Student studentT = new Student("Tomas",10000);
		Student studentEd = new Student("Edward", 20000);
		
		Bus bus100 = new Bus(100);
		Bus bus500 = new Bus(500);
		
		studentJ.takeBus(bus100);
		
		Subway greenSubway = new Subway(2);
		studentT.takeSubway(greenSubway);
		
		Taxi wellTaxi = new Taxi("�� ���� ���");
		studentEd.takeTaxi(wellTaxi);
		
		System.out.println("-----�л�-----");
		studentJ.showInfo();
		studentT.showInfo();
		studentEd.showInfo();
		System.out.println();
		System.out.println("-----���߱���-----");
		bus100.showBusinfo();
		greenSubway.showSubwayinfo();
		wellTaxi.showTaxiinfo();
		
		bus500.showBusinfo();
		
		
	}

}
