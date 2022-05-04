package day12_정렬을위한Comparable과Comparator인터페이스구현하기;

import java.util.Comparator;

public class Member implements Comparator<Member> {
	//Comparable 매개변수 하나가 넘어옴.
	//
	private int memberId;
	private String memberName;
	
	public Member() {}
	
	//컨스트럭터
	public Member(int memberId, String memberName) {
		this.memberId = memberId;
		this.memberName = memberName;
	}
	
	//Getters and Setters
	public int getMemberId() {
		return memberId;
	}
	public void setMemberId(int memberId) {
		this.memberId =memberId;
	}
	
	
	public String getMemberName() {
		return memberName;
	}
	public void setMemberName(String memberName) {
		this.memberName = memberName;
	}

	
	
	
	@Override
	public int hashCode() {
		return memberId;
	}

	@Override
	public boolean equals(Object obj) {
		if(obj instanceof Member) {
			Member member =(Member)obj;
			if(this.memberId ==member.memberId) {
				return true;
			}
			else return false;
		}
		return false;
	}

	@Override
	public String toString() {
		return memberName + " 회원님의 아이디는 "+ memberId+"입니다.";
	}

	/*
	@Override
	public int compareTo(Member member) {
		
		//오름차순으로 1을 -1로 바꾸면 내림차순으로
		/*if(this.memberId>member.memberId)
			return 1;
		else if(this.memberId < member.memberId)
			return -1;
		else return 0;
		//이것을 더 간단하게 아래와 같이
		return(this.memberId-member.memberId); //내림차순으로하려면 곱하기-1
	}
	*/ 
	
	//Comparator 매개변수2개, 
	@Override
	public int compare(Member member1, Member member2) {
		return (member1.memberId-member2.memberId);
	}
	
}

