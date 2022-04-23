package Myself_Part1;

import java.util.Scanner;
public class day4_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		//1. Switch case 한 달이 며칠인지 알려주는 프로그램.
		System.out.println("몇 달을 확인하고 싶은지 달을 입력해주세요(숫자만 가능) ");
		Scanner scanner = new Scanner(System.in);
		int month = scanner.nextInt();
		int day;
		switch(month) {
		
			case 1: case 3: case 5: case 7: case 8: case 10: case 12:
				day = 31;
				break;
			case 2: 
				day = 28;
				break;
			case 4: case 6: case 9: case 11:
				day = 30;
				break;
				
			default:
				System.out.println("존재하지 않는 달입니다.");
				day = -1;
		}
		System.out.println(month + "월은 "+ day +"일 까지 입니다.");
		System.out.println("-----------------------");
		
		// 2. 문자열이 지원되는 Switch case
		Scanner scanner1 = new Scanner(System.in);
		
		System.out.println("당신의 메달을 입력해 주세요. ex) Gold, Sliver, Bronze (대소문자 구별있음)");
		String medal = scanner1.next();
		switch(medal) {
			case "Gold":
				System.out.println("당신의 금메달 입니다.");
				break;
			case "Sliver":
				System.out.println("당신의 은메달 입니다.");
				break;
			case "Bronze":
				System.out.println("당신의 동메달 입니다.");
				break;
			default:
				System.out.println("잘못 입력 하셨거나, 메달을 획득하지 못하였습니다. 그래도 멋지십니다! 당신의 열정! 노력! 항상 응원합니다!");
				break;
		}
		System.out.println("고생하셨습니다. 당신을 응원합니다.");	
		System.out.println("----------------------");
		
		//3. Switch case 구문 JAVA 14 새로운 버젼 업데이트
		System.out.println("몇 달을 확인하고 싶은지 달을 입력해주세요(숫자만 가능) ");
		int month1 = scanner.nextInt();
		int day1 = switch(month1) {
			case 1,3,5,7,8,10,12->{
				System.out.println("1,3,5,7,8,10,12 월은 일 수가 같습니다! ");
				yield 31; 
			}
			case 2-> 
				28;
			case 4,6,9,11->
				30;				
			default->{//둘 줄 이상을 사용할때는 중괄호{}사용해주고 반환값인 yield를 입력해주어야 한다!
				System.out.println("존재하지 않는 달입니다.");
				 yield -1;
			}
		}; //Switch문 끝을 알려주는 ;
		System.out.println(month1 + "월은 "+ day1 +"일 까지 입니다.");
		
		
		
		
	}
}