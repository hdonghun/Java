package Myself_Part1;
//1. 자료형(data type) - 실수 표현 //

public class day1 {

	public static void main(String[] args) {
	
		byte bnum = -128;
		
		System.out.println(bnum);
		
		// int num = 12345678900; #오류 이유 out of range
		long lNum = 12345678900L;
		
		// 1. 자료형(data type) - 실수 표현
		// 부동 소수점 방식  > 지수와 가수로 나누어서 표현한다.
		// 실수 정규화 : 가수가 밑수보다 작은 한 자리까지 가수로 표현되는것.
		// 컴퓨터에서는 밑수가 2 이므로 정규화를 하게 되면 가수 부분의 첫 번 자리 숫자는 항상 1임
		// 예) 0.2 포현 0.4*2**-1 정규화 하면 1.6 **2**-3
		
		double dnum = 3.14; //8바이트
		float fnum = 3.14f; //4바이트
		
		System.out.println(dnum);
		System.out.println(fnum);
		
		// 부동 소수점 방식의 오류
		double ddnum = 1;
		for(int i = 0; i <10000; i++) {
			ddnum = ddnum +0.1;
		}
		System.out.println(ddnum); // 1001.000000000159 이 출력되어진다.
		
		System.out.println("--------------------");
		
		
	}
	}
