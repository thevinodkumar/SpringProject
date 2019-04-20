package com.nt.controller;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.List;
import java.util.Map;

import javax.servlet.ServletContext;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.commons.io.IOUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import com.nt.service.FileService;

@Controller
public class FileDownloadingController {
	@Autowired
	private FileService service;

	public FileDownloadingController() {
	System.out.println("FileDownloadingController.FileDownloadingController()");
	}
	

	@GetMapping("/welcome.htm")
	public String show(Map<String, Object> map, HttpServletRequest req) {
		System.out.println("FileDownloadingController.show()");
		List<String> list;
		String loc = null;
		ServletContext sc = req.getServletContext();
		// get init param value
		loc = sc.getInitParameter("location");
		// use service
		list = service.fileNames(loc);
		map.put("files", list);
		return "home";
	}

	@GetMapping("/download.htm")
	public void download(HttpServletRequest req, HttpServletResponse res) throws Exception {
		String name = req.getParameter("name");
		String loc = null;
		ServletContext sc = req.getServletContext();
		// get init param value
		loc = sc.getInitParameter("location");
		String location = loc + "/" + name;
		InputStream is = new FileInputStream(location);
		res.addHeader("content-disposition", "attachement;filename=" + name);
		OutputStream os = res.getOutputStream();
		IOUtils.copy(is, os);
		os.close();
		is.close();
	}
}