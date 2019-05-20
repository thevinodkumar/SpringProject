package com.nt.command;

import java.util.Date;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;

import org.hibernate.validator.constraints.Length;

import lombok.Data;

@Data
public class UserCommand {
	@Length(max=10,min=4,message="max 10 and min 4")
	@NotBlank(message="name must be required")
	private String name;
	@NotEmpty(message="pwd must be required")	
	private String pwd;
	private Integer age;
	private String count;
	private String[] hobbies;
	private Date date;
	public UserCommand(){
		System.out.println("UserCommand.UserCommand()");
	}
	
}
