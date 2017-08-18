package com.uc.security;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.AuthenticationException;
import org.springframework.security.web.authentication.UsernamePasswordAuthenticationFilter;

/**
 * 自定义登录验证的FILTER，需要查询出用户有哪些角色
 * @author my
 *
 */
public class LoginFilter  extends UsernamePasswordAuthenticationFilter{

	@Override
	public Authentication attemptAuthentication(HttpServletRequest request,
			HttpServletResponse response) throws AuthenticationException {
		
		String username = obtainUsername(request);
		String password = obtainPassword(request);

		//产生TOKEN  通过查看源码  会跟USERDETAILS进行比对 
		UsernamePasswordAuthenticationToken authRequest = new UsernamePasswordAuthenticationToken(
				username, password);

		// 允许子类设置详细属性
		setDetails(request, authRequest);
		
		AuthenticationManager am = this.getAuthenticationManager();
		Authentication ac = 	am.authenticate(authRequest);
		
		return ac;
	}

	@Override
	protected String obtainPassword(HttpServletRequest request) {
		Object obj = request.getParameter(this.getPasswordParameter());
		
		return null == obj ? "" : obj.toString();
	}

	@Override
	protected String obtainUsername(HttpServletRequest request) {
		Object obj = request.getParameter(this.getUsernameParameter());
		return null == obj ? "" : obj.toString();
	}

	
	
	
}
