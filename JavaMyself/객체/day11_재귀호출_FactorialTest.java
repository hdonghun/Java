package 객체;

public class day11_재귀호출_FactorialTest {
	
	static long factorial(int n) {
		if(n<=0 || n>20) return -1; // 매개변수의 유호성 검사.
		if(n<=1) return 1;
			return n*factorial(n-1);  // 1~20
		}
	
	
	public static void main(String[] args) {
		int n =21;
		long result = 0;
		
		for(int i =1; i<=n; i++) {
			result = factorial(i);
			
			if(result==-1) {
				System.out.printf("유효하지 않는 값입니다.(0<n<=20):%d%n", n);
				break;
			}
			
			System.out.printf("%2d!=%20d%n",i,result);
		}
	} // main의 끝
}
