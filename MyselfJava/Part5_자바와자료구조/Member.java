package day12_������������α׷�1;

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
	public String toString() {
		return memberName + " ȸ������ ���̵�� "+ memberId+"�Դϴ�.";
	}

	
}

