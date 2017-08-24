package com.acezk.oa.web.sys;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.acezk.oa.web.BaseController;

@Controller
public class LoginController extends BaseController {
	
	@RequestMapping("/login")
	public String login() {
		
		return "/sys/";
	}
	
	@RequestMapping("/logout")
	public String logout() {
		
		return "";
	}
}
