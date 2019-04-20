package com.nt.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class TilesController {

	@RequestMapping("/welcome.htm")
	public String home() {
		return "home";
	}

	@RequestMapping("/page1.htm")
	public String page1() {
		return "entertainment";
	}

	@RequestMapping("/page2.htm")
	public String page2() {
		return "sports";
	}

	@RequestMapping("/page3.htm")
	public String page3() {
		return "political";
	}

	@RequestMapping("/page4.htm")
	public String page4() {
		return "love";
	}
}
