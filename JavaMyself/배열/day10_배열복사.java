package �迭;

public class day10_�迭���� {
//�迭 ����
	public static void main(String[] args) {
		int[] arr = new int[5];
		
		for(int i =0; i < arr.length; i++) 
			arr[i] = i;
		
		System.out.println("������");
		
		int[] tmp = new int[arr.length*2];
		
		for(int i = 0; i<arr.length; i++)
			tmp[i] = arr[i];
		
		for(int i=0; i<tmp.length; i++) 
			System.out.println("tmp["+i+"]:"+tmp[i]);
		
	}}
