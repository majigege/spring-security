package com.uc.security;

import java.util.Collection;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.uc.dao.IUserDao;
import com.uc.pojo.User;

/**
 * 查询用户 并设置UserDetails
 * @author my
 *
 */
@Service("userServiceDetail")
public class MyUserDetailService  implements UserDetailsService{

	@Autowired
	private IUserDao userDao;
	
	@Override
	public UserDetails loadUserByUsername(String username)
			throws UsernameNotFoundException {
		System.out.println("MyUserDetailService" + username);

		//查询用户
		User user = userDao.selectUser(username);
		//查询权限
		List<String> roles = userDao.selectRoles(user.getId());
		//将权限设置到UserDetails
		user.setRoles(roles);
		 
		//打印权限  飘过-------------
		 Collection<? extends GrantedAuthority>  gas = user.getAuthorities();
		 for (GrantedAuthority ga : gas )
		 {
			 System.out.println("GrantedAuthority = " + ga.getAuthority());
		 }
		 
		return user;
	}


}
