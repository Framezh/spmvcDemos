package com.spdemo.services;

import com.spdemo.entity.User;

/**
 * @author zalman
 * @email 528091954@qq.com
 * @date: 2016年1月10日 @time: 上午10:53:30
 */
public interface UserService {

	public void createUser(User user);

	public User getUserById(String userId);
}
