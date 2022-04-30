package 배열;

import java.util.Arrays;

public class day10_임의의값으로배열채우기_Array_toString이용 {

	public static void main(String[] args) {
		
		int[] arr = {-1,2,-3,4,5,-2};
		
		for(int i =0; i<arr.length; i++) {
			arr[i] = (int)(Math.random()*5);
		}
		System.out.println(Arrays.toString(arr));

	}

}
