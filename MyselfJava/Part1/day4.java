package Myself_Part1;

import java.util.*;

public class day4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//1. �ݺ��� - while ��
			int num = 1;
			int sum = 0;
			while(num <=10) {
				sum += num;
				num++;
			}
				
			System.out.println(sum);
			System.out.println(num);
			System.out.println("----------");
			
		//2. do-while ��( ���ǰ� ��� ���� �ѹ��� ���๮�� ����!)
			Scanner scanner = new Scanner(System.in);
			int input;
			int sum1 = 0;
				
			do {
				input = scanner.nextInt();
				sum1+=input;					
				}while(input!=0);
			System.out.println(sum1);
				
		//3. �ݺ��� - for ��
			int count = 1;
			int sum2 = 0;
				
			for(int i=0; i<10; i++, count++) {
				sum+=count;
			}
			System.out.println(sum2);
			System.out.println("------------");
		
		
			int num1 = 1;
			int total = 0;
			while(num1<=15) {
			total+=num1;
			num1++;
		}
		System.out.println(total);
	}

}
