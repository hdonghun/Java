package day14_reduce메서드;

import java.util.Arrays;
import java.util.function.BinaryOperator;

class CompareString implements BinaryOperator<String>{

	@Override
	public String apply(String s1, String s2) {
		{if(s1.getBytes().length >= s2.getBytes().length) return s1;
		else return s2;
		}		
	}
	
}

public class ReduceTest {

	public static void main(String[] args) {
		String greetings[] = {"안녕하세요~~~", "hello", "Good morning", "반갑습니다^^"	};
		
		//이것이 지저분하다면, 위에 BinaryOperator로~~
		System.out.println(Arrays.stream(greetings).reduce("",(s1,s2)->
				{if(s1.getBytes().length >= s2.getBytes().length) return s1;
				else return s2;}
				));
		
		//호출방법
		String str = Arrays.stream(greetings).reduce(new CompareString()).get();
		System.out.println(str);
	
	}
}
