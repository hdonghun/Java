package 객체;

public class day11_메서드의선언과구현 {
	
	메서드는 크게 두 부분, '선언부(header,머리)'와 '구현부(body,몸통)으로 이루어져 있다.
	
	ex) 반환타입 메서드이름(타입 변수명, 타입변수명,..) {
		// 메서드 호출시 수행될 코드
	}
	int add(int a, int b) {						// 선언부
		int result = a+b;						// 구현부
		return result; //호출한 메서드로 결과를 반환한다.
	}
}
