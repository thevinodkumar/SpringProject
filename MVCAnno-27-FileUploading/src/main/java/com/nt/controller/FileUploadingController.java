package com.nt.controller;

import java.io.IOException;
import java.io.InputStream;
import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.nt.command.JobSeekerDetails;

@Controller
public class FileUploadingController {

	@GetMapping("/register.htm")
	public String showForm(@ModelAttribute("upCmd") JobSeekerDetails jsd) {
		return "register";
	}

	@PostMapping("/register.htm")
	public String process(@ModelAttribute("upCmd") JobSeekerDetails jsd, Map<String, Object> map) throws IOException {
		String name1 = null, name2 = null;
		InputStream is1 = null, is2 = null;
		is1 = jsd.getResume().getInputStream();
		is2 = jsd.getPhoto().getInputStream();
		
		return "register";
	}
}
