package day12_�ߺ������ʰ��ڷḦ�����ϴ�Set�������̽���������Ŭ������Ȱ��;

import java.util.HashSet;
import java.util.Iterator;

public class MemberHashSet {
	
	private HashSet<Member>hashSet;
	
	public MemberHashSet() {
		hashSet = new HashSet();
	}
	public MemberHashSet(int size) {
		hashSet = new HashSet<>(size);
	}
	
	
	public void addMember(Member member) {
		hashSet.add(member);
	}
	
	public boolean removeMember(int memberId) {
		/*for(int i =0; i<hashSet.size(); i++) {
			Member member = hashSet.get(i);
			
			int tempId = member.getMemberId();
			if(tempId == memberId) {
				hashSet.remove(i);
				return true;
			}
		}*/
		
		System.out.println(memberId + "�� �������� �ʽ��ϴ�.");
		return false;
	}
	
	public void showAllMember() {
		for(Member member : hashSet) {
			System.out.println(member);
		}
		System.out.println();
	}
	
}
