package Myself_Part1;

public class day5_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		// 1.break�� ����ϱ�
		// �߰��� ���ߴ� break��, �����ϰ� ��� �����ϴ� continue��
		
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
