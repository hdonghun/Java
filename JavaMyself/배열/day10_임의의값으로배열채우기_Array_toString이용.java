package �迭;

import java.util.Arrays;

public class day10_�����ǰ����ι迭ä���_Array_toString�̿� {

	public static void main(String[] args) {
		
		int[] arr = {-1,2,-3,4,5,-2};
		
		for(int i =0; i<arr.length; i++) {
			arr[i] = (int)(Math.random()*5);
		}
		System.out.println(Arrays.toString(arr));

	}

}
