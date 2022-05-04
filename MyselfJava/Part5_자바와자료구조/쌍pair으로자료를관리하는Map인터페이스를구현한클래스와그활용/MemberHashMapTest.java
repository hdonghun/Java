package day12_쌍pair으로자료를관리하는Map인터페이스를구현한클래스와그활용;

import java.util.HashMap;
import java.util.TreeSet;

public class MemberHashMapTest {

	public static void main(String[] args) {
		
		
		MemberHashMap memberHashMapSet = new MemberHashMap();
		
		Member memberHong = new Member(1004,"홍길동");
		Member memberLee = new Member(1001, "이순신");
		Member memberKim = new Member(1002, "김유신");
		Member memberKang= new Member(1003, "강감찬");

		memberHashMapSet.addMember(memberHong);
		memberHashMapSet.addMember(memberLee);
		memberHashMapSet.addMember(memberKim);
		memberHashMapSet.addMember(memberKang);

		memberHashMapSet.showAllMember();
		//동일한 값을 가진 객체는 들어갈 수 없다.
		
		HashMap<Integer,String> hashMap = new HashMap<Integer,String>();
		hashMap.put(1001,"Kim");
		hashMap.put(1002,"Lee");
		hashMap.put(1003,"Park");
		hashMap.put(1004,"Hong");
		
		System.out.println(hashMap);

	}

}

// Comparable이 구현된 경우 Comparator로 다시 구현가능..
// Comparator은 어렵.....
// Comparator을 사용하려면, TreeSet 컨스트럭트에 인자 설정, 
