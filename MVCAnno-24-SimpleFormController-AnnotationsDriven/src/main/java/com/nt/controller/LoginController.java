package com.nt.controller;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Map;

import javax.validation.Valid;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.propertyeditors.CustomDateEditor;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.SessionAttributes;

import com.nt.command.UserCommand;
import com.nt.dto.UserDto;
import com.nt.service.UserService;

@Controller
@SessionAttributes(value = "userCmd", types = UserCommand.class)
public class LoginController {

	@Autowired
	private UserService service;

	// use to kept usercommand obj to session obj
	@ModelAttribute("userCmd")
	public UserCommand kept() {
		return new UserCommand();
	}

	@RequestMapping(value = "/login.htm", method = RequestMethod.GET)
	public String showForm(@ModelAttribute("userCmd") UserCommand cmd) {
		return "login";
	}

	@RequestMapping(value = "/login.htm", method = RequestMethod.POST)
	public String process(Map<String, Object> map, @Valid @ModelAttribute("userCmd") UserCommand cmd,
			BindingResult errors) {
		if (errors.hasErrors())
			return "login";
		UserDto dto = new UserDto();
		BeanUtils.copyProperties(cmd, dto);
		String msg = service.login(dto);
		map.put("resultMsg", msg);
		map.put("cmd", cmd);
		return "login";
	}

	// alternate to refrence data
	@ModelAttribute("country")
	public List<String> getList() {
		List<String> list = new ArrayList();
		list.add("afg");
		list.add("india");
		list.add("pk");
		list.add("sa");
		list.add("usa");
		list.add("china");
		return list;
	}

	@ModelAttribute("hobbies")
	public List<String> getHobbies() {
		List<String> list = new ArrayList();
		list.add("sleeping");
		list.add("eating");
		list.add("fighting");
		list.add("roaming");
		return list;
	}

	//init binder
	@InitBinder()
	public void init(WebDataBinder binder) {
		SimpleDateFormat smf=new SimpleDateFormat("dd-MM-yyyy");
		binder.registerCustomEditor(Date.class, new CustomDateEditor(smf, true));
	}
	
}
