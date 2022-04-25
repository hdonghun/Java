package Myself_Part1;

public class day5_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		// 1.break문 사용하기
		// 중간에 멈추는 break문, 무시하고 계속 진행하는 continue문
		
		int sum = 0;
		int num;
		for(num=1;;num++) {
			sum+=num;
			if(sum>=100)
				break;
		}
		System.out.println(sum);
		System.out.println(num);
		
		
		
	}

}
