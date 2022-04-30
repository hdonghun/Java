package 배열;

public class day10_배열최대최소구하기 {
	public static void main(String[] args) {
		
		int[] score = {19,29,88,76,37,48,99,39,59,76,82, 91};
		int max = score[0]; //초기화
		int min = score[0];	//초기화
		
		for(int i =1; i<score.length; i++) {
			if(score[i]>max) {
				max = score[i];
			}
			else if(score[i]<min){
				min = score[i];
			}
			
		}
		System.out.println("최대값: "+max);
		System.out.println("최소값: "+min);
		
	}
}
