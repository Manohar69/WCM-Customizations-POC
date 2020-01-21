package com.sivavaka.test.springportlet.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("EDIT")
public class SivaTestSpringPortletEditController {

	@RequestMapping
	public String displayEditView(){
		return "edit";
	}
}
