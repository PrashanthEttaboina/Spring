package com.motivity;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class AppointmentController {
	
//	@RequestMapping("/register")
//	public String register(HttpServletRequest request,HttpServletResponse response)
//	{
//		String username=request.getParameter("username");
//		String password=request.getParameter("password");
//		String email=request.getParameter("email");
//		String phone=request.getParameter("phone");
//		
//		
//		request.setAttribute("username",username);
//		request.setAttribute("password", password);
//		request.setAttribute("email.", email);
//		request.setAttribute("phone", phone);
//		
//		return "welcome";
//	}
	
	
	@RequestMapping("/register")
	public ModelAndView register(HttpServletRequest request,HttpServletResponse response)
	{
		String username=request.getParameter("username");
		String password=request.getParameter("password");
		String email=request.getParameter("email");
		String phone=request.getParameter("phone");
		
		
		ModelAndView ma=new ModelAndView();
		
		ma.setViewName("welcome");
		ma.addObject("username", username);
		ma.addObject("password", password);
		ma.addObject("email.", email);
		ma.addObject("phone", phone);
		
		return ma;
	}
}
