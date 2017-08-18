package com.acezk.oa.user;

import java.util.List;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import com.acezk.oa.BaseTest;
import com.acezk.oa.entity.sys.User;
import com.acezk.oa.service.sys.UserService;
import com.acezk.oa.view.sys.UserVO;
import com.alibaba.fastjson.JSON;
import com.github.pagehelper.PageInfo;

public class UserServiceTest extends BaseTest {
	
	@Autowired
	private  UserService userService;
	
	@Test
	public void queryUserListTest() {
		UserVO vo = new UserVO();
		String res = userService.getList(vo);
		System.out.println(res);
		PageInfo<User> pageInfo = JSON.parseObject(res, PageInfo.class);
		List<User> u = pageInfo.getList();
		System.out.println("list size" + u.size());
		System.out.println("总条数：" + pageInfo.getTotal());
		System.out.println("总页数：" + pageInfo.getPages());
		System.out.println("当前页数：" + pageInfo.getPageNum());
		System.out.println("每页条数：" + pageInfo.getSize());
	}
}
