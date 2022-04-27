package day6_싱글톤패턴;

public class Company {
	
	//유일한 객체 //외부에서 사용 가능하게 끔 만들어주기
	private static Company instance=new Company();
	
	private Company() {
	}
	
	// 외부에서 생성할 수도 없고, 내부에 private로 하나 생성되어 있고, 이(getInstance)메서드만 제공되기 때문에, 이 메서드로 
	// 싱글톤 패턴! 이해가...
	public static Company getInstance() {
		if(instance==null) {
			instance = new Company();
		}
		return instance;
	}
	
	
}
