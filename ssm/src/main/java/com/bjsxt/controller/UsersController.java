package com.bjsxt.controller;

import javax.annotation.Resource;

import com.bjsxt.service.UsersService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class UsersController {
	@Resource
	private UsersService usersServiceImpl;
	@RequestMapping("show")
	public String show(Model model){
		model.addAttribute("list", usersServiceImpl.show());
		return "index.jsp";
	}
}
