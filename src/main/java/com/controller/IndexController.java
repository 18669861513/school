package com.controller;

import java.util.List;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.entity.Resource;
import com.entity.User;
import com.service.ResourceService;
import com.service.UserService;

@Controller
public class IndexController {

	@Autowired
	private ResourceService resourceService;
	@Autowired
	private UserService userService;
	
	@RequestMapping(value="/")
	public String index(User loginUser, Model model){
		Set<String> permissions = userService.findPermissions(loginUser.getUsername());
		List<Resource> menus = resourceService.findMenus(permissions);
		model.addAttribute("menus", menus);
		return "index";
	}
	
	@RequestMapping(value="/welcome")
	public String welcome(){
		return "welcome";
	}
}
