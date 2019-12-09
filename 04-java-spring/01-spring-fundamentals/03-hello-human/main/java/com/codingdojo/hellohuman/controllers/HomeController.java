package com.codingdojo.hellohuman.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class HomeController {
	@RequestMapping("/")
	public String index(@RequestParam(value="name", required=false) String name, Model model) {
		System.out.println(name);
		if (name == null) {
			model.addAttribute("name", "Human");
		} else {
			model.addAttribute("name", name);
		}
		return "index.jsp";
	}
}
