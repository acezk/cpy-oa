package com.acezk.oa.dao.sys;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.acezk.oa.entity.sys.User;

public interface UserDao {
	
	List<User> queryUserAll(User u);
	
	/**
	 * 通过id查询用户
	 * @param id
	 * @return
	 */
	User queryUserById(@Param("id") Integer id);
	
	/**
	 * 新增用户
	 * @param user
	 */
	void insertUser(User user);
	
	/**
	 * 修改用户
	 * @param user
	 */
	void updateUser(User user);
	
	/**
	 * 通过id删除用户
	 * @param id
	 */
	void deleteUserById(@Param("id") Integer id);
}
