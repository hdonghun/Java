package �迭;

public class day10_�迭�ִ��ּұ��ϱ� {
	public static void main(String[] args) {
		
		int[] score = {19,29,88,76,37,48,99,39,59,76,82, 91};
		int max = score[0]; //�ʱ�ȭ
		int min = score[0];	//�ʱ�ȭ
		
		for(int i =1; i<score.length; i++) {
			if(score[i]>max) {
				max = score[i];
			}
			else if(score[i]<min){
				min = score[i];
			}
			
		}
		System.out.println("�ִ밪: "+max);
		System.out.println("�ּҰ�: "+min);
		
	}
}
