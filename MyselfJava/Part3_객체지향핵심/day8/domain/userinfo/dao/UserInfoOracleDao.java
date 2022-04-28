package day8.domain.userinfo.dao.oracle;

import day8.domain.userinfo.UserInfo;
import day8.domain.userinfo.dao.UserInfoDao;

public class UserInfoOracleDao implements UserInfoDao{

	@Override
	public void insertUserInfo(UserInfo userInfo) {
		System.out.println("Insert into ORACLE DB userID="+userInfo.getUserId());
	}

	@Override
	public void updateUserInfo(UserInfo userInfo) {
		System.out.println("Update into ORACLE DB userID="+userInfo.getUserId());
	}

	@Override
	public void deleteUserInfo(UserInfo userInfo) {
		System.out.println("Delete From ORACLE DB userID="+userInfo.getUserId());	
	}

}
