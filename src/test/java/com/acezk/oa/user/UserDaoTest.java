package com.acezk.oa.user;

import java.util.List;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import com.acezk.oa.BaseTest;
import com.acezk.oa.dao.sys.UserDao;
import com.acezk.oa.entity.sys.User;

public class UserDaoTest extends BaseTest {
	
	@Autowired
	private UserDao userDao;
	
	@Test
	public void queryAllTest() {
		User u = new User(); 
		List<User> users = userDao.queryUserAll(u);
		System.out.println(users.size());
	}
	
	@Test
	public void queryUserByIdTest() {
		User u = new User();
		u = userDao.queryUserById(1);
		System.out.println(u.getBirthday());
	}
}
