package day12_��pair�����ڷḦ�����ϴ�Map�������̽���������Ŭ�����ͱ�Ȱ��;

import java.util.HashMap;
import java.util.TreeSet;

public class MemberHashMapTest {

	public static void main(String[] args) {
		
		
		MemberHashMap memberHashMapSet = new MemberHashMap();
		
		Member memberHong = new Member(1004,"ȫ�浿");
		Member memberLee = new Member(1001, "�̼���");
		Member memberKim = new Member(1002, "������");
		Member memberKang= new Member(1003, "������");

		memberHashMapSet.addMember(memberHong);
		memberHashMapSet.addMember(memberLee);
		memberHashMapSet.addMember(memberKim);
		memberHashMapSet.addMember(memberKang);

		memberHashMapSet.showAllMember();
		//������ ���� ���� ��ü�� �� �� ����.
		
		HashMap<Integer,String> hashMap = new HashMap<Integer,String>();
		hashMap.put(1001,"Kim");
		hashMap.put(1002,"Lee");
		hashMap.put(1003,"Park");
		hashMap.put(1004,"Hong");
		
		System.out.println(hashMap);

	}

}

// Comparable�� ������ ��� Comparator�� �ٽ� ��������..
// Comparator�� ���.....
// Comparator�� ����Ϸ���, TreeSet ����Ʈ��Ʈ�� ���� ����, 
