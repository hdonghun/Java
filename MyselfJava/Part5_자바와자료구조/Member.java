package day12_중복되지않게자료를관리하는Set인터페이스를구현한클래스와활용;

public class Member {

	private int memberId;
	private String memberName;
	
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

	
}

