package com.acezk.oa.dao.sys;

import java.util.List;

import com.acezk.oa.entity.sys.User;

public interface UserDao {
	
	List<User> selectUserList(User u);
	
}
