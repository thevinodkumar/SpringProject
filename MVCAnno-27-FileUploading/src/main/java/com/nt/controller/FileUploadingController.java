package com.nt.controller;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Map;

import org.apache.commons.io.IOUtils;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.nt.command.JobSeekerDetails;

@Controller
public class FileUploadingController {

	// @RequestMapping(value="/re.htm")
//	public String show() {
//		return "register";
//	}

	@GetMapping("/re.htm")
	public String showForm(@ModelAttribute("upCmd") JobSeekerDetails jsd) {
		return "register";
	}

	@PostMapping("/re.htm")
	public String process(@ModelAttribute("upCmd") JobSeekerDetails jsd, Map<String, Object> map) throws IOException {
		String name1 = null, name2 = null, name3 = null;
		InputStream is1 = null, is2 = null, is3 = null;
		OutputStream o1 = null,o2=null,o3=null;
		is1 = jsd.getResume().getInputStream();
		is2 = jsd.getPhoto().getInputStream();
		is3 = jsd.getAudio().getInputStream();

		name1 = jsd.getPhoto().getOriginalFilename();
		name2 = jsd.getResume().getOriginalFilename();
		name3 = jsd.getAudio().getOriginalFilename();

		File f = new File("E:/Spring");
		if(!f.exists()) {
			f.mkdir();
		}
		o1 = new FileOutputStream(f.getAbsolutePath()+"/"+name1);
		o2 = new FileOutputStream(f.getAbsolutePath()+"/"+name2);
		o3 = new FileOutputStream(f.getAbsolutePath()+"/"+name3);
		IOUtils.copy(is1, o1);
		IOUtils.copy(is2, o2);
		IOUtils.copy(is3, o3);

		map.put("file1", name1);
		map.put("file2", name2);
		map.put("file3", name3);

		return "register";
	}
}
