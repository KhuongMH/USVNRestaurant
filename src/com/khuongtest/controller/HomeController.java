package com.khuongtest.controller;

import org.springframework.stereotype.Controller;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class HomeController {
	
	@RequestMapping(value = "/", method = { RequestMethod.GET, RequestMethod.HEAD})
	public String list(Model model) {
		model.addAttribute("aba", "aba");
		return "index";
	}
}
