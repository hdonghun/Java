package Myself_Part1;

import java.util.Scanner;
public class day4_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		//1. Switch case �� ���� ��ĥ���� �˷��ִ� ���α׷�.
		System.out.println("�� ���� Ȯ���ϰ� ������ ���� �Է����ּ���(���ڸ� ����) ");
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
				System.out.println("�������� �ʴ� ���Դϴ�.");
				day = -1;
		}
		System.out.println(month + "���� "+ day +"�� ���� �Դϴ�.");
		System.out.println("-----------------------");
		
		// 2. ���ڿ��� �����Ǵ� Switch case
		Scanner scanner1 = new Scanner(System.in);
		
		System.out.println("����� �޴��� �Է��� �ּ���. ex) Gold, Sliver, Bronze (��ҹ��� ��������)");
		String medal = scanner1.next();
		switch(medal) {
			case "Gold":
				System.out.println("����� �ݸ޴� �Դϴ�.");
				break;
			case "Sliver":
				System.out.println("����� ���޴� �Դϴ�.");
				break;
			case "Bronze":
				System.out.println("����� ���޴� �Դϴ�.");
				break;
			default:
				System.out.println("�߸� �Է� �ϼ̰ų�, �޴��� ȹ������ ���Ͽ����ϴ�. �׷��� �����ʴϴ�! ����� ����! ���! �׻� �����մϴ�!");
				break;
		}
		System.out.println("����ϼ̽��ϴ�. ����� �����մϴ�.");	
		System.out.println("----------------------");
		
		//3. Switch case ���� JAVA 14 ���ο� ���� ������Ʈ
		System.out.println("�� ���� Ȯ���ϰ� ������ ���� �Է����ּ���(���ڸ� ����) ");
		int month1 = scanner.nextInt();
		int day1 = switch(month1) {
			case 1,3,5,7,8,10,12->{
				System.out.println("1,3,5,7,8,10,12 ���� �� ���� �����ϴ�! ");
				yield 31; 
			}
			case 2-> 
				28;
			case 4,6,9,11->
				30;				
			default->{//�� �� �̻��� ����Ҷ��� �߰�ȣ{}������ְ� ��ȯ���� yield�� �Է����־�� �Ѵ�!
				System.out.println("�������� �ʴ� ���Դϴ�.");
				 yield -1;
			}
		}; //Switch�� ���� �˷��ִ� ;
		System.out.println(month1 + "���� "+ day1 +"�� ���� �Դϴ�.");
		
		
		
		
	}
}