package com.spdemo.services.impl;

import org.springframework.stereotype.Service;

import com.spdemo.entity.User;
import com.spdemo.services.UserService;

/**
 * @author zalman
 * @email 528091954@qq.com
 * @date: 2016年1月10日 @time: 上午10:54:33
 */
@Service
public class UserServiceImpl implements UserService {

	@Override
	public void createUser(User user){
		System.out.println("save user.");
	}

	@Override
	public User getUserById(String userId) {
		User user = new User();
		user.setUserId(userId);
		user.setUserName("test");
		return user;
	}

}
