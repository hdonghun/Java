package 생성자Constructor;

	
//	생성자는 인스턴스가 생성될 때 호출되는 '인스턴스 초기화 메서드'이다.
//	따라서 인스턴스 변수의 초기화 작업에 주로 사용되며, 인스턴스 생성 시에 실행 되어야 할 작업을 위해서도 사용된다.
//	생성자도 메서드이기 때문에 리턴값이 없다는 의미의 void를 붙여야 하지만, 모든 생성자가 리턴값이 없으므로 void를 생략할 수 있게 한것이다.
//	생성자도 오버로딩이 가능하므로 하나의 클래스에 여러개의 생성자가 존재할 수 있다.
//	ex

	class Data1{
		int value;
	}
	
	class Data2{
		int value;
		Data2(int x){
			value = x;
		}
	}
	
	class ConstrucorTest{
		public static void main(String[] args) {
			Data1 d1 = new Data1();
			Data2 d2 = new Data2(8); // <<
		}
	}
	//인스턴스를 생성할떄, 생성자에 맞게 구현해주면 문제없다.
	
	
// 생성자 호출은 첫번째 줄에서!!
	