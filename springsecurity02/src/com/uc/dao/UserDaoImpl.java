package com.uc.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.uc.mapper.UserMapper;
import com.uc.pojo.User;

/**
 * 采用配置文件的方式
 * @author Administrator
 *
 */

@Repository("userDao")
public class UserDaoImpl  implements IUserDao
{
	@Autowired
	private UserMapper userMapper;

	@Override
	public User selectUser(String username) {
		
		return userMapper.selectUser(username);
	}

	@Override
	public List<String> selectRoles(int userId) {
		
		return userMapper.selectRoles(userId);
	}
	
}
