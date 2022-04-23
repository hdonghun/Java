package Myself_Part1;

import java.util.Scanner;

public class day3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//1. 증가 감소 연산자
		int gameScore = 150;
		int lastScore = ++gameScore; // gameScore += 1;, gameScore = gameScore +1;
		System.out.println(lastScore);
		System.out.println(gameScore);

		int gameScore1 = 150;
		int lastScore1= gameScore++; 
		System.out.println("lastScore1: "+lastScore1);
		System.out.println("gmaeScore1: "+gameScore1);
		System.out.println("-----------------------");
		
		//2. 관계 논리 연산자
		//(1)
		int max;
		System.out.println("두 수를 입력 받아서 더 큰 수를 출력하세요");
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("입력 1:");
		int num1 = scanner.nextInt();
		System.out.println("입력 2:");
		int num2 = scanner.nextInt();
		
		max = (num1 > num2)? num1 : num2;
		System.out.println(max);
		System.out.println("----------");
		//(2) 비트 연산자
		
		int num3 = 5;
		int num4 = 10;
		
		System.out.println(num3 | num4);
		System.out.println(num3 & num4);
		System.out.println(num3 ^ num4);
		System.out.println(~num3);
		System.out.println(num3<<2);
		System.out.println(num3>>2);
	
	}
}
