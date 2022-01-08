package com.projects.stringmatcher.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.projects.stringmatcher.models.InputData;
import com.projects.stringmatcher.services.ApplicationServices;

@Controller
@RequestMapping("/")
public class MainController {

	@Autowired
	ApplicationServices businessLogic;

	@RequestMapping(method = RequestMethod.GET, value = "/")
	public String homePage(Model model) {
		InputData inputData = new InputData();
		model.addAttribute("data",inputData);
		return "index";
	}
	

	@PostMapping(value = "/compare")
	public String compareData(Model model,@ModelAttribute("data") InputData inputData) {
		String data1 = inputData.getOriginalString();
		String data2 = inputData.getDuplicateString();
		data1 = businessLogic.updateStringsForHtmlTags(data1);
		data2 = businessLogic.updateStringsForHtmlTags(data2);
		String resultString= businessLogic.compareStrings(data1, data2);
		model.addAttribute("data1", data1);
		model.addAttribute("data2", resultString);
		return "index";
	}
}
