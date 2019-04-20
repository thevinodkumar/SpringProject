package com.nt.service;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

@Service("service")
public class FileService {

	public List<String> fileNames(String loc) {
		System.out.println("FileService.fileNames()");
		List<String> list = new ArrayList();
		File file = new File(loc);
		File name[] = null;
		String names = null;
		name = file.listFiles();
		for (File f : name) {
			names = f.getName();
			list.add(names);
		}

		return list;
	}
}
