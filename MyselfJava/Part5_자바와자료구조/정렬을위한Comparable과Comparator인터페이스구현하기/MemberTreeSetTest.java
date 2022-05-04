package day12_정렬을위한Comparable과Comparator인터페이스구현하기;

import java.util.TreeSet;

public class MemberTreeSetTest {

	public static void main(String[] args) {
		
		
		MemberTreeSet memberTreeSet = new MemberTreeSet();
		
		Member memberHong = new Member(1004,"홍길동");
		Member memberLee = new Member(1001, "이순신");
		Member memberKim = new Member(1002, "김유신");
		Member memberKang= new Member(1003, "강감찬");

		memberTreeSet.addMember(memberHong);
		memberTreeSet.addMember(memberLee);
		memberTreeSet.addMember(memberKim);
		memberTreeSet.addMember(memberKang);

		memberTreeSet.showAllMember();
		//동일한 값을 가진 객체는 들어갈 수 없다.
	}

}

// Comparable이 구현된 경우 Comparator로 다시 구현가능..
// Comparator은 어렵.....
// Comparator을 사용하려면, TreeSet 컨스트럭트에 인자 설정, 
