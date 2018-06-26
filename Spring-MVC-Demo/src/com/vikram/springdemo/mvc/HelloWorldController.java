package com.vikram.springdemo.mvc;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/hello")
public class HelloWorldController {

	
@RequestMapping("/showform")	
public String showPage()
{
	return "Helloworld-form";
}

@RequestMapping("/processform")
public String processPage()
{
	return "Helloworld";
}

@RequestMapping("/processformversiontwo")
public String processpageupdated(HttpServletRequest request,Model model)
{
	
	String name=request.getParameter("studentname");
	name=name.toUpperCase();
	String result="YO! "+ name;
	
	model.addAttribute("message", result);
	return "Helloworld";
}

@RequestMapping("/processformversionthree")
public String processpage(@RequestParam("studentname") String name,Model model)
{
	
	
	name=name.toUpperCase();
	String result="Wass up! "+ name;
	
	model.addAttribute("message", result);
	return "Helloworld";
}
	
}
