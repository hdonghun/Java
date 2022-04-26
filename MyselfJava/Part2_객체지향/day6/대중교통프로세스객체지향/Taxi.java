package day6_버스프로세스객체지향프로그래밍;
//앞의 예제에서 Edward는 지각을 해서 택시를 타야 했습니다.
//20000원을 가지고 있었는데 10000원을 택시비로 사용했습니다.
//택시는 '잘나간다 운수'회사 택시를 탔습니다.
//출력문 : Edward님의 남은 돈은 10000원입니다.
//잘 간다 운수택시 수입은 10000원 입니다.


	public class Taxi {
	
		String taxiCompanyName;
		int money;


		public Taxi(String taxiCompanyName) {
			this.taxiCompanyName = taxiCompanyName;
		}
		
		public void take(int money) {
			this.money += money;
		}

		public void showTaxiinfo() {
			System.out.println(taxiCompanyName+"의 택시 수입은 "+money+"원 입니다.");
		}
}
