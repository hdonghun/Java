package day14_��Ʈ��;

import java.util.Arrays;
import java.util.stream.IntStream;

public class IntArrayStreamTest {

	public static void main(String[] args) {
		
		int[] arr = {1,2,3,4,5};
		for(int num:arr) {
			System.out.println(num);
		}
		//��Ʈ���� ���
		System.out.println();
		IntStream is = Arrays.stream(arr);
		is.forEach(n->System.out.println(n));
		//������ �ϰ� ���� is�� �ٽ� ��� �� �� ����.
		//��Ʈ���� �Ź� ������ؾߵȴ�.
		System.out.println();
		long sum = Arrays.stream(arr).sum();
		System.out.println(sum);
		//
		
	
	}
}
