package day12_�ߺ������ʰ��ڷḦ�����ϴ�Set�������̽���������Ŭ������Ȱ��;

public class Member {

	private int memberId;
	private String memberName;
	
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

	
}

