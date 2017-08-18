package com.uc.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import com.uc.pojo.User;

/**
 * 采用注解的方式进行操作
 * @author Administrator
 *
 */
public interface UserMapper 
{

	
	/**
	 * 查询用户表
	 * @param username
	 * @return
	 */
	@Select("select * from sec_user where username=#{name}")
	User selectUser(@Param("name")String username);
	

	/**
	 * 查询用户权限
	 * @param userId
	 * @return
	 */
	@Select("select roles from sec_roles sr, (select rolesId  rid from sec_user_roles where userId = #{userId}) sur"
			 + " where sur.rid = sr.id")
	List<String>  selectRoles(@Param("userId") int userId);
	
}
