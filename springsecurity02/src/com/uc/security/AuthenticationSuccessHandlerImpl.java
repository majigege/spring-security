package com.uc.security;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.security.core.Authentication;
import org.springframework.security.web.authentication.AuthenticationSuccessHandler;

/**
 * 认证成功的HANDLER 目前没有用到  直接用配置文件的方式来进行的 s
 * @author my
 *
 */
public class AuthenticationSuccessHandlerImpl implements AuthenticationSuccessHandler
{

	@Override
	public void onAuthenticationSuccess(HttpServletRequest request,
			HttpServletResponse res, Authentication arg2) throws IOException,
			ServletException {
		System.out.println("-------------");
		res.sendRedirect(request.getContextPath());
		
	}

}
