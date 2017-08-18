package com.acezk.oa.service.sys.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.acezk.oa.dao.sys.UserDao;
import com.acezk.oa.entity.sys.User;
import com.acezk.oa.service.sys.UserService;
import com.acezk.oa.view.sys.UserVO;
import com.alibaba.fastjson.JSON;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;

@Service
public class UserServiceImpl implements UserService {
	
	@Resource
	private UserDao userDao;

	@Override
	public String getList(UserVO vo) {
		String res = "";
		PageHelper.startPage(1, 10);
		List<User> users = userDao.queryUserAll(vo);
		PageInfo<User> pageinfo = new PageInfo<User>(users);
		res = JSON.toJSONString(pageinfo);
		return res;
	}

}
