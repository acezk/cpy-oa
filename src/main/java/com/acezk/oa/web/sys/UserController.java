package com.acezk.oa.web.sys;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/user")
public class UserController {
	
	@RequestMapping("/list")
	public String initList() {
		return "/user/user_list";
	}
}
