package day15_예외처리;

public class ArrayIndexException {

	public static void main(String[] args) {

		int[] arr = {1,2,3,4,5};
		
		try {
		for(int i=0; i<=5; i++) {
			System.out.println(arr[i]);
			}
		}catch(ArrayIndexOutOfBoundsException e) {
			System.out.println(e.getMessage());
			System.out.println(e.toString());
		}
		System.out.println("예외처리로 문제없이 진행");
	}
}
