package day12_����������Comparable��Comparator�������̽������ϱ�;

import java.util.TreeSet;

public class MemberTreeSetTest {

	public static void main(String[] args) {
		
		
		MemberTreeSet memberTreeSet = new MemberTreeSet();
		
		Member memberHong = new Member(1004,"ȫ�浿");
		Member memberLee = new Member(1001, "�̼���");
		Member memberKim = new Member(1002, "������");
		Member memberKang= new Member(1003, "������");

		memberTreeSet.addMember(memberHong);
		memberTreeSet.addMember(memberLee);
		memberTreeSet.addMember(memberKim);
		memberTreeSet.addMember(memberKang);

		memberTreeSet.showAllMember();
		//������ ���� ���� ��ü�� �� �� ����.
	}

}

// Comparable�� ������ ��� Comparator�� �ٽ� ��������..
// Comparator�� ���.....
// Comparator�� ����Ϸ���, TreeSet ����Ʈ��Ʈ�� ���� ����, 
