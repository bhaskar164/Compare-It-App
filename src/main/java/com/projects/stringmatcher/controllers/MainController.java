package com.projects.stringmatcher.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("/")
public class MainController {

	@RequestMapping(method = RequestMethod.GET, value= "/home")
	public String homePage() {
		return "index";
	}
}
