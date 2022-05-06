package day14_스트림;

import java.util.Arrays;
import java.util.stream.IntStream;

public class IntArrayStreamTest {

	public static void main(String[] args) {
		
		int[] arr = {1,2,3,4,5};
		for(int num:arr) {
			System.out.println(num);
		}
		//스트림을 사용
		System.out.println();
		IntStream is = Arrays.stream(arr);
		is.forEach(n->System.out.println(n));
		//연산을 하고 나서 is를 다시 사용 할 수 없다.
		//스트림은 매번 재생성해야된다.
		System.out.println();
		long sum = Arrays.stream(arr).sum();
		System.out.println(sum);
		//
		
	
	}
}
