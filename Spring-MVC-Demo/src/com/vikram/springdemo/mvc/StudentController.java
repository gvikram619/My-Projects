package com.vikram.springdemo.mvc;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/student")
public class StudentController {
	
@RequestMapping("/showform")	
public String showForm(Model themodel)
{
	Student thestudent=new Student();
	
	themodel.addAttribute("student",thestudent );
	
	
	
	return "student-form";
	
}

@RequestMapping("/processform")
public String processForm(@ModelAttribute ("student") Student thestudent)
{
	
	System.out.println("student:"+ thestudent.getFirstName()+ " " + thestudent.getLastName());
	return "student-confirmation";
}


}
