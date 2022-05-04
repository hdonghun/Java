package day12_중복되지않게자료를관리하는Set인터페이스를구현한클래스와활용;

public class MemberHashSetTest {

	public static void main(String[] args) {
		
		MemberHashSet memberHashSet = new MemberHashSet();
		
		Member memberLee = new Member(1001, "이순신");
		Member memberKim = new Member(1002, "김유신");
		Member memberKang= new Member(1003, "강감찬");

		memberHashSet.addMember(memberLee);
		memberHashSet.addMember(memberKim);
		memberHashSet.addMember(memberKang);

		memberHashSet.showAllMember();
		
		Member memberHong = new Member(1003,"홍길동");
		memberHashSet.addMember(memberHong);

		memberHashSet.showAllMember();
		// 동일한 값을 가진 객체는 들어갈 수 없다.
	}

}
