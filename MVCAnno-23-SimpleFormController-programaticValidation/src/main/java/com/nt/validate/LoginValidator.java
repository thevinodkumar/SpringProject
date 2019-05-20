package com.nt.validate;

import org.springframework.stereotype.Component;
import org.springframework.validation.Errors;
import org.springframework.validation.Validator;

import com.nt.command.UserCommand;

@Component("valide")
public class LoginValidator  implements Validator{

	@Override
	public boolean supports(Class<?> clazz) {
		return clazz.isAssignableFrom(UserCommand.class);
	}

	@Override
	public void validate(Object target, Errors errors) {
		UserCommand cmd=null;
		cmd=(UserCommand) target;
		if(cmd.getName()==null || cmd.getName().length()==0 || cmd.getName().isEmpty()==true) {
			errors.rejectValue("name","name.required");
		}
		if(cmd.getPwd()==null || cmd.getPwd().length()==0 || cmd.getPwd().isEmpty()==true) {
			errors.rejectValue("pwd","pwd.repuired");
		}
		
	}
}
