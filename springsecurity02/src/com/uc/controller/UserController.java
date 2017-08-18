package com.uc.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
public class UserController {
	
	

	/**
	 * 用户登录
	 * 
	 * @param name
	 * @param age
	 * @param model
	 * @param res
	 * @return
	 */
	@RequestMapping("login")
	public String login(String name, String pwd, HttpServletRequest res,Model model) 
	{
		return "index";
	}

	/**
	 * USER用户可以访问
	 * 

	 * @return
	 */
	@RequestMapping("/user/userPage")
	public String mainPage() {
		System.out.println("user用户访问。");

		return "userPage";
	}

	/**
	 * admin 用户访问
	 *
	 * @return
	 */
	@RequestMapping("home/adminPage")
	public String mainPage2() {
		System.out.println("admin用户访问。..");

		return "adminPage";
	}
	
	/**
	 * admin 用户访问
	 *
	 * @return
	 */
//	@RequestMapping("logout")
//	public String logout(HttpServletRequest request, HttpServletResponse response) 
//	{
//		System.out.println("logout..");
//		Authentication auth = SecurityContextHolder.getContext().getAuthentication();  
//	   
//		if (auth != null){      
//	        new SecurityContextLogoutHandler().logout(request, response, auth);  
//	    }  
//
//		return "redirect:/logon.jsp";
//	}

}
