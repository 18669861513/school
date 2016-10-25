package com.controller;

import org.apache.shiro.authz.annotation.RequiresRoles;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class TestController {

	@RequiresRoles("admin")
	@RequestMapping("/hello2")
	public String hello2(){
		return "success";
	}
}
