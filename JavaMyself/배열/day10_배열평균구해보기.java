package �迭;

public class day10_�迭��ձ��غ��� {
	public static void main(String[] args) {
		
	int num = 0;
	int sum = 0;
	float average = 0f;

	int[] score = {99, 29, 44, 89, 78, 66, 57, 61, 21, 16, 100,89,68,88};
	for(int i =0; i < score.length; i++) {
		sum += score[i];
	}
	average = sum / (float)(score.length);
	System.out.println("���� : " + sum);
	System.out.println("��� : " + average);
	}
}
