package day12_정렬을위한Comparable과Comparator인터페이스구현하기;

import java.util.TreeSet;
import java.util.Iterator;

public class MemberTreeSet {
	
	//비교 대상이 되는 객체에 Comparable이나 Comparator 인터페이스를 구현해야 TreeSet에 추가 될 수 있음.
	private TreeSet<Member>treeSet;
	
	public MemberTreeSet() {
		treeSet = new TreeSet<Member>(new Member());
	}
	
	public void addMember(Member member) {
		treeSet.add(member);
	}
	
	public boolean removeMember(int memberId) {
		Iterator<Member> ir = treeSet.iterator();
		
		while(ir.hasNext()) {
			Member member = ir.next();
			
			int tempId = member.getMemberId();
			if(tempId==memberId) {
				treeSet.remove(member);
				return true;
			}
		}
		
		System.out.println(memberId + "가 존재하지 않습니다.");
		return false;
	}
	
	public void showAllMember() {
		for(Member member : treeSet) {
			System.out.println(member);
		}
		System.out.println();
	}
	
}
