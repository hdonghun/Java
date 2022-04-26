package day6_버스프로세스객체지향프로그래밍;

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
		
		Taxi wellTaxi = new Taxi("잘 간다 운수");
		studentEd.takeTaxi(wellTaxi);
		
		System.out.println("-----학생-----");
		studentJ.showInfo();
		studentT.showInfo();
		studentEd.showInfo();
		System.out.println();
		System.out.println("-----대중교통-----");
		bus100.showBusinfo();
		greenSubway.showSubwayinfo();
		wellTaxi.showTaxiinfo();
		
		bus500.showBusinfo();
		
		
	}

}
