package com.spdemo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.spdemo.entity.User;
import com.spdemo.services.impl.UserServiceImpl;

/**
 * @author zalman
 * @email 528091954@qq.com
 * @date: 2016年1月10日 @time: 上午10:43:54
 */
@Controller
@RequestMapping("/user")
public class UserController {

	@RequestMapping("/register")
	public String register() {
		return "user/register";
	}
	
	@Autowired
	private UserServiceImpl userService;

	@RequestMapping(method = RequestMethod.POST)
	public ModelAndView createUser(User user) {
		userService.createUser(user);
		ModelAndView mav = new ModelAndView();
		mav.setViewName("user/createSuccess");
		mav.addObject("user", user);
		return mav;
	}
}
