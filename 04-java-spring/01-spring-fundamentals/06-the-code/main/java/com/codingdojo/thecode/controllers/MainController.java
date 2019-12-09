package com.codingdojo.thecode.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

@Controller
public class MainController {
	private Boolean isValid(String message) {
		return message.equals("bushido");
	}
	
	@RequestMapping("/")
	public String index() {
		return "index.jsp";
	}
	
	@RequestMapping(value="/submit", method=RequestMethod.POST)
	public String submitCode(@RequestParam(value="message") String message, RedirectAttributes redirectAttributes) {
		if (isValid(message)) {
			return "redirect:/code";
		}
		redirectAttributes.addFlashAttribute("error", "You must train harder!");
		return "redirect:/";
	}
	
	@RequestMapping("/code")
	public String code(Model model) {
		String[] codes = {"Loyalty", "Courage", "Veracity", "Compassion", "Honor"};
		model.addAttribute("codes", codes);
		return "code.jsp";
	}
}
