package com.nt.command;

import lombok.Data;

@Data
public class UserCommand {

	private String name;
	private String pwd;
	private String flag="no";
	private Integer age;
	
}
