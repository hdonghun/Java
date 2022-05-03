package 다형성;

public class day12_참조변수의형변환 {}
	
	// 조상타隙픈滑떵� > 자손타입의참조변수 로 형변환 : 다운캐스팅(Down-casting)
	// 자손타입의참조변수 > 조상타隙픈滑떵� 로 형변환: 업캐스팅(Up-casting)
	
	// 참조변수간의 형변환 역시 캐스트연산자를 사용하며, 괄호()안에 변환하고자 하는 타입의 이름(클래스명)을 적어주면 된다.
	class Car{
		String color;
		int door;
		void drive() {
			System.out.println("dirve, Brrrrrrr~");
			}
		void stop() {
			System.out.println("stop!!!");
			}
	}
	
	class FireEngine extends Car{
		void water() {
			System.out.println("water!!!");
			}
	}
	
	class Ambulance extends Car{
		void siren() {
			System.out.println("siren~~~");
			}
	}
	
	class CastingTest1{
		public static void main(String[] args) {
			Car car = null;
			FireEngine fe = new FireEngine();
			FireEngine fe2 = null;
			
			fe.water();
			car = fe; // car = (Car)fe;에서 형반환이 생략된 형태다.
			fe2 = (FireEngine)car;
			fe2.water();			
		}
	}
	// 형변환은 참조변수의 타입을 변환하는 것이지 인스턴스를 변환하는 것은 아니기 때문에 참조변수의 형변환은 인스턴스에 아무런 영향을 미치지 않는다.
	// 단지 참조변수의 형변환을 통해서, 참조하고 있는 인스턴스에서 사용할 수 있는 멤버의 범위(개수)를 조절하는 것뿐이다.
	
	// 서로 상속관계에 있는 타입간의 형변환은 양방향으로 자유롭게 수행될 수 있으나, 참조변수가 가리키는 인스턴스의 자손타입으로 형변환은 허용되지 않는다.
	// 그래서 참조변수가 가리키는 인스턴스의 타입이 무엇이니지 확인하는 것이 중요하다.
	
	
