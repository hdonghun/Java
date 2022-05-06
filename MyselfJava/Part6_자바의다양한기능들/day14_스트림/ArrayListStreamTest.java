package day14_스트림;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class ArrayListStreamTest {
	
	public static void main(String[] args) {
		
		List<String> sList = new ArrayList<String>();
		sList.add("김동민");
		sList.add("한동훈11");
		sList.add("이민섭");
		//스트림생성방법
		Stream<String> stream = sList.stream();
		//스트림을 어떻게 이용할껀지
		stream.forEach(s->System.out.println(s));
		System.out.println();
		//
		sList.stream().sorted().forEach(s->System.out.print(s+"\t"));
		//
		System.out.println();
		//글자수
		sList.stream().map(s->s.length()).forEach(n->System.out.print(n+"\t"));
		//무슨 연산을 하던간에 기존의 자료인 sList는 변하지 않는다.
		System.out.println();
		sList.stream().filter(s->s.length()>=5).forEach(s->System.out.println(s));
		
		//자료의 대상과 관계없이 동일한 연산을 수행
		//배열, 컬렉션을 대상으로 연산을 수행 함
		//일관성 있는 연산으로 자료의 처리를 쉽고 간단하게 함
		//자료 처리에 대한 추상화가 구현되었다고 함
	}
}
