package com.motivity;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.hibernate.Session;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.SessionAttribute;
import org.springframework.web.servlet.ModelAndView;


@Controller
public class PatientController {

	@Autowired
	private PatientDao patientDao;
	
	@RequestMapping(value={ "/", "/index" },method=RequestMethod.GET)
	private String indexPage()
	{
		return "index";		
	}
	
	@RequestMapping(value="/patient_register", method=RequestMethod.GET)
	private String patientRegister(Model model)
	{
		model.addAttribute("register", new PatientBean());
		return "patient_register";
	}
	
	@RequestMapping(value = "/patient_home", method = RequestMethod.GET)
	public String patientHome() {
		return "patient_home";
	}
	@RequestMapping(value = "/appointment", method = RequestMethod.GET)
	public String appointment(Model model) {
		model.addAttribute("appointment",new AppointmentBean());
		return "appointment";
	}

	
	@RequestMapping(value="/patient_login",method=RequestMethod.GET)
	private String patientLogin(Model model)
	{
		model.addAttribute("plogin", new PatientBean());
		return "patient_login";
		
	}
	@RequestMapping(value="/patient_profile",method=RequestMethod.GET)
	private String patientProfile(Model model,@SessionAttribute("patient") PatientBean patient)
	{
		model.addAttribute("pprofile", patient);
		return "patient_profile";
	}
	
	@RequestMapping(value="/update_patient_profile",method=RequestMethod.GET)
	private String patientUpdateProfile(Model model,@SessionAttribute("patient") PatientBean patient)
	{
		model.addAttribute("pprofile", patient);
		return "update_patient_profile";
	}

	@RequestMapping(value="/add_patient",method=RequestMethod.POST)
	public ModelAndView patientRegister(PatientBean register)
	{
		boolean status = patientDao.registerPatient(register);
		
		ModelAndView mv=new ModelAndView();
		if(status)
		{
			mv.setViewName("patient_login");
			mv.addObject("msg", "Registered Successfully");
		}
		return mv;	
	}
	
	@RequestMapping(value="/plogin",method=RequestMethod.POST)
	public ModelAndView patientLogin(HttpServletRequest request)
	{
		String email=request.getParameter("email");
		String password=request.getParameter("password");
		
		PatientBean patient=patientDao.patientLogin(email,password);
		
		ModelAndView mv=new ModelAndView();
		if(patient==null)
		{
			mv.setViewName("patient_login");
		}
		else
		{
			HttpSession ss=request.getSession();
			ss.setAttribute("patient", patient);
			mv.setViewName("patient_home");
		}
		return mv;	
	}
	
	@RequestMapping(value = "/update_patient", method = RequestMethod.POST)
	public ModelAndView patientUpdate(PatientBean pprofile,HttpServletRequest request) {
		PatientBean pb = patientDao.updatePatient(pprofile);
		ModelAndView mv = new ModelAndView();
		if (pb!=null) {
			mv.setViewName("patient_profile");
			mv.addObject("pprofile", pb);
			HttpSession hs=request.getSession();
			hs.setAttribute("patientDetails", pb);
		} else {
			mv.setViewName("update_patient_profile");
			mv.addObject("patient", pprofile);
		}
		return mv;
	}
	
	@RequestMapping(value = "/apply_appointment", method = RequestMethod.POST)
	public ModelAndView applyAppointment(AppointmentBean appointment,@SessionAttribute("patientDetails") PatientBean patient) {
		appointment.setPatient(patient);
		boolean status = patientDao.applyAppointment(appointment);
		ModelAndView mv = new ModelAndView();
		if (status) {
			mv.setViewName("patient_home");
		} else {
			mv.setViewName("appointment");
			mv.addObject("appointment",new AppointmentBean());
		}
		return mv;
	}
	
	@RequestMapping(value = "/appointment_status", method = RequestMethod.GET)
	public ModelAndView appointmentStatus(@SessionAttribute("patient") PatientBean patient) {
		List<AppointmentBean> li = patientDao.appointmentStatus(patient);
		ModelAndView mv= new ModelAndView();
		mv.setViewName("appointment_status");
		mv.addObject("list", li);
		return mv;
	}
	
}
