package Myself_Part1;

import java.util.*;

public class day4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//1. 조건문 if
		int age = 6;
		if(age >= 8) {
			System.out.println("학교에 다닙니다.");	
		}
		else {
			System.out.println("학교에 다니지 않습니다.");
		}
		System.out.println("노는게 젤 좋아");
		System.out.println("---------------------");
	
		//2. 조건이 여러 개 일 떄의 if문 
		//if-else
		System.out.println("HDH의 나이를 입력하여 주세요.");
		Scanner scanner = new Scanner(System.in);
		int HDH = scanner.nextInt();
		
		if (HDH < 30) {
			System.out.println("열심히 하면 기회는 있다 백엔드 개발자가 되어보자!");
		}
		else if(HDH<35) {
			System.out.println("지금쯤이면 너는 벡엔드 개발자가 되어 현업에서 재미있게 좋은 동료들과 일하고 있겠지?");
		}
		else if(HDH<40) {
			System.out.println("결혼은 했을까? 돈은 얼마나 모았을까 ?");
		}
		else {
			System.out.println("너의 인생은 니가 사는거야 너는 지금 행복에게 너의 인생을 살고 있니?");
		}
		System.out.println("너의 나이 "+HDH+"이면, 포기하지마 할 수 있어 !");
	
		
	
	
	}
}
