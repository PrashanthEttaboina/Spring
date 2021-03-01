package com.ex;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class AppointmentController {

	@Autowired
	private StudentDao studentDao;
	
	@RequestMapping("/")
	public String indexPage(Model model)
	{
		model.addAttribute("register", new StudentBean());
		
		return "index";		
	}
	
	@RequestMapping(value="/register",method=RequestMethod.POST)
	public ModelAndView studentRegister(StudentBean register)
	{
		studentDao.saveStudent(register);
		
		ModelAndView mv=new ModelAndView();
		mv.setViewName("display");
		mv.addObject("username", register.getUsername());
		mv.addObject("password",register.getPassword());
		mv.addObject("email", register.getEmail());
		mv.addObject("phone", register.getPhone());
		mv.addObject("designation", register.getDesignation());
		return mv;
		
	}
	
	
}
