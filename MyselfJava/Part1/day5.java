package Myself_Part1;

public class day5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// 1. ÁßÃ¸ ¹Ýº¹¹®
		//for
		int dan;
		int count;
		for(dan=2; dan<=9; dan++) {
			for(count=1; count<=9; count++) {
				System.out.println(dan + "X"+ count + "=" + dan*count);
			}
			System.out.println();
		}
		System.out.println("-----------------");
		
		//while
		int dan1 = 2;
		int count1=1;
		while(dan1<=9) {
			count1 = 1;
			while(count1<=9) {
				System.out.println(dan1 + "X"+ count1 + "=" + dan1*count1);
				count1++;
			}
			dan1++;
			System.out.println();
		}
	}
}
