package com.nt.controller;

import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.nt.cmd.Student;

@Controller
public class StudentRegController {
	
	@RequestMapping("/welcome.htm")
	public String home(@ModelAttribute("cmd")Student st,Map<String,Object> map) {
		return "register";
	}
}