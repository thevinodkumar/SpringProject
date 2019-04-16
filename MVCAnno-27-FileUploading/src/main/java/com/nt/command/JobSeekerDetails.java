package com.nt.command;

import org.springframework.web.multipart.MultipartFile;

import lombok.Data;

@Data
public class JobSeekerDetails {

	private String name;
	private String desg;
	private MultipartFile resume;
	private MultipartFile photo;
	private MultipartFile audio;
	
}
