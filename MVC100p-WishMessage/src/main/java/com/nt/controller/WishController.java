package com.nt.controller;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import com.nt.service.WishService;

@Controller
public class WishController {

	@Autowired
	private WishService service;

	@GetMapping("/welcome.htm")
	public String home() {
		return "home";
	}

	@GetMapping("/wish.htm")
	public String wish(Map<String, Object> map) {
		String wish = service.wish();
		map.put("msg", wish);
		return "result";
	}
}
