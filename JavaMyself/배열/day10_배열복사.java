package 배열;

public class day10_배열복사 {
//배열 복사
	public static void main(String[] args) {
		int[] arr = new int[5];
		
		for(int i =0; i < arr.length; i++) 
			arr[i] = i;
		
		System.out.println("변경후");
		
		int[] tmp = new int[arr.length*2];
		
		for(int i = 0; i<arr.length; i++)
			tmp[i] = arr[i];
		
		for(int i=0; i<tmp.length; i++) 
			System.out.println("tmp["+i+"]:"+tmp[i]);
		
	}}
