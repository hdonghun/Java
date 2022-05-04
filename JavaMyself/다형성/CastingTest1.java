package 다형성.다형성이란_day12;

public class CastingTest1 {}
//조상클래스 타입의 참조변수로 자손클래스의 인스턴스를 참조할 수 있도록 하였다.
	class Tv{
		boolean power;
		int channel;
		
		void power() {power = !power;}
		void channelUp(){++channel;}
		void channelDown() {--channel;}
	}
	
	class CaptionTv extends Tv{
		String text; //캡션을 보여주기 위한 문자열
		void caption() {
		}
	}	
		
	class TvTest{
		public static void main(String[] args) {
			
			CaptionTv c = new CaptionTv();
			Tv t = new CaptionTv();
			
			//c.caption();
			//t.  //caption이 없다.
			//둘 다 같은 타입의 인스턴스지만 참조 변수의 타입에 따라 사용할 수 있는 멤버의 개수가 달라진다.
			// 참조변수가 사용할 수 있는 멤버의 개수는 인스턴스의 멤버 개수보다 같거나 적어야 한다.
			//그렇기 문에 CaptionTv c = new Tv();는 불가능 하다.
			//결론 : 조상타입의 참조변수로 자손타입의 인스턴스를 참조할 수 있다.
			//		반대로 자손타입의 참조변수로 조상타입의 인스턴스를 참조 할 수 없다.
		}
	}