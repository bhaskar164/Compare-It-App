package com.projects.stringmatcher.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/")
public class MainController {

	@RequestMapping(method = RequestMethod.GET, value= "/home")
	public String homePage() {
		return "index";
	}
	
	@PostMapping(value="/compare")
	public String compareData(@RequestParam("fileOne") String data1, @RequestParam("fileTwo") String data2  ) {
		System.out.println(data1);
		System.out.println(data2);
		return "index";
	}
}
