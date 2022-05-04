package day12_����������Comparable��Comparator�������̽������ϱ�;

import java.util.Comparator;

public class Member implements Comparator<Member> {
	//Comparable �Ű����� �ϳ��� �Ѿ��.
	//
	private int memberId;
	private String memberName;
	
	public Member() {}
	
	//����Ʈ����
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
		return memberName + " ȸ������ ���̵�� "+ memberId+"�Դϴ�.";
	}

	/*
	@Override
	public int compareTo(Member member) {
		
		//������������ 1�� -1�� �ٲٸ� ������������
		/*if(this.memberId>member.memberId)
			return 1;
		else if(this.memberId < member.memberId)
			return -1;
		else return 0;
		//�̰��� �� �����ϰ� �Ʒ��� ����
		return(this.memberId-member.memberId); //�������������Ϸ��� ���ϱ�-1
	}
	*/ 
	
	//Comparator �Ű�����2��, 
	@Override
	public int compare(Member member1, Member member2) {
		return (member1.memberId-member2.memberId);
	}
	
}

