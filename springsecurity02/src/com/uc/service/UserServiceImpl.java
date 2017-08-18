package com.uc.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.uc.dao.IUserDao;
import com.uc.pojo.User;

/**
 * 采用配置文件的方式
 * @author Administrator
 *
 */

@Service("userService")
public class UserServiceImpl  implements IUserService
{
	@Autowired
	private IUserDao userDao;

	@Override
	public User selectUser(String username) {
		
		return userDao.selectUser(username);
	}

	@Override
	public List<String> selectRoles(int userId) {
		
		return userDao.selectRoles(userId);
	}
	
}
