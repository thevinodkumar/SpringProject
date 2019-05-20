package com.nt.controller;

import java.util.Map;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.context.annotation.SessionScope;

import com.nt.command.UserCommand;
import com.nt.dto.UserDto;
import com.nt.service.UserService;
import com.nt.validate.LoginValidator;

@Controller
public class LoginController {

	@Autowired
	private UserService service;
	@Autowired
	private LoginValidator valide;

	@RequestMapping(value = "/login.htm", method = RequestMethod.GET)
	public String showForm(@ModelAttribute("userCmd") UserCommand cmd) {
		return "login";
	}

	@RequestMapping(value = "/login.htm", method = RequestMethod.POST)
	public String process(Map<String, Object> map, @ModelAttribute("userCmd") UserCommand cmd, BindingResult errors) {
		UserDto dto = new UserDto();
		if(!cmd.getFlag().equalsIgnoreCase("yes")) {
		System.out.println("LoginController.process()");
		System.out.println(cmd.getFlag());
		if (valide.supports(UserCommand.class)) {
			valide.validate(cmd, errors);
			if (errors.hasErrors()) {
				return "login";
			}
		}
		}System.out.println(cmd.getFlag());
		BeanUtils.copyProperties(cmd, dto);
		String msg = service.login(dto);
		map.put("resultMsg", msg);
		return "login";
	}
}
