package Myself_Part1;

import java.util.*;

public class day4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//1. ���ǹ� if
		int age = 6;
		if(age >= 8) {
			System.out.println("�б��� �ٴմϴ�.");	
		}
		else {
			System.out.println("�б��� �ٴ��� �ʽ��ϴ�.");
		}
		System.out.println("��°� �� ����");
		System.out.println("---------------------");
	
		//2. ������ ���� �� �� ���� if�� 
		//if-else
		System.out.println("HDH�� ���̸� �Է��Ͽ� �ּ���.");
		Scanner scanner = new Scanner(System.in);
		int HDH = scanner.nextInt();
		
		if (HDH < 30) {
			System.out.println("������ �ϸ� ��ȸ�� �ִ� �鿣�� �����ڰ� �Ǿ��!");
		}
		else if(HDH<35) {
			System.out.println("�������̸� �ʴ� ������ �����ڰ� �Ǿ� �������� ����ְ� ���� ������ ���ϰ� �ְ���?");
		}
		else if(HDH<40) {
			System.out.println("��ȥ�� ������? ���� �󸶳� ������� ?");
		}
		else {
			System.out.println("���� �λ��� �ϰ� ��°ž� �ʴ� ���� �ູ���� ���� �λ��� ��� �ִ�?");
		}
		System.out.println("���� ���� "+HDH+"�̸�, ���������� �� �� �־� !");
	
		
	
	
	}
}
