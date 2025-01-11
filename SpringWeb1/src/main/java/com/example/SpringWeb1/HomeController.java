package com.example.SpringWeb1;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HomeController {
	
	@ModelAttribute("course")
	public String courseName() {
		return "Java";
	}

	@RequestMapping("/")
	public String home() {
		System.out.println("home method called");
		return "index";
	}
	
	/*
	 * @RequestMapping("add") public String add(HttpServletRequest req, HttpSession
	 * session) {
	 * 
	 * int num1 = Integer.parseInt(req.getParameter("num1")); int num2 =
	 * Integer.parseInt(req.getParameter("num2")); int result = num1 + num2;
	 * 
	 * session.setAttribute("result", result); return "result.jsp"; }
	 */
	
	/*
	 * @RequestMapping("add") public String add(@RequestParam("num1") int
	 * num1, @RequestParam("num2") int num2, Model model) {
	 * 
	 * int result = num1 + num2;
	 * 
	 * model.addAttribute("result", result); return "result"; }
	 */
	
	@RequestMapping("add")
	public ModelAndView add(@RequestParam("num1") int num1, @RequestParam("num2") int num2, ModelAndView mv) {
		
		int result = num1 + num2;
 
		mv.addObject("result", result);
		mv.setViewName("result");
		return mv;
	}
	
	@RequestMapping("addStudent")
	public String addStudent(Student student) {
	//public String addAlien(@ModelAttribute("alien1") Alien alien) {           ModelAttribute is optional if name is same
       
		return "result";
	}
}
