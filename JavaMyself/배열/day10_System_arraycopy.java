package ¹è¿­;

public class day10_System_arraycopy {
	public static void main(String[] args) {
		
		char[] abc = {'a','b','c','d'};
		char[] num = {'1','2','3','4','5','6','7','8','9'};
		System.out.println(abc);
		System.out.println(num);
		System.out.println();
		
		char[] result = new char[abc.length + num.length];
		System.arraycopy(abc, 0, result, 0, abc.length);
		System.arraycopy(num, 0, result, abc.length, num.length);
		System.out.println(result);
		System.out.println();
		
		System.arraycopy(abc, 0, num, 0, abc.length);
		System.out.println(num);
		System.out.println();
		
		System.arraycopy(abc, 0, num, 6, 3);
		System.out.println(num);
	}
}
