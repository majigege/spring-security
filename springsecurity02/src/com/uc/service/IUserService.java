package com.uc.service;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.uc.pojo.User;

/**
 * 采用配置文件的方式
 * @author Administrator
 *
 */

public interface IUserService
{
	/**
	 * 查询用户表
	 * @param username
	 * @return
	 */
	User selectUser(@Param("name")String username);
	

	/**
	 * 查询用户权限
	 * @param userId
	 * @return
	 */
	List<String>  selectRoles(@Param("userId") int userId);
	
	
}
