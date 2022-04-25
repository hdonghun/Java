package day6_접근제어자와정보은닉;

public class BirthDay {

	private int day;
	private int month;
	private int year;
	
	private boolean isValid; //디폴트값 false!
	
	public int getDay() {
		return day;
	}
	public void setDay(int day) {
		this.day = day;
	}
	//Generate Gets and Sets을 이용하여! 나머지 2가지를 간단하게 만든다!
	public int getMonth() {
		return month;
	}
	public void setMonth(int month) {
		if(month<1||month>12){
			isValid =false;
		}
		else {
			isValid = true;
			this.month = month;
		}
	}
	
	
	public int getYear() {
		return year;
	}
	public void setYear(int year) {
		this.year = year;
	}
	
	
	public void showDate() {
		if(isValid) {
			System.out.println(year + "년 "+month+"월 "+day+"일 입니다.");
		}
		else {
			System.out.println("유효하지 않는 날짜 입니다.");
		}
	}
	
	
	
}
