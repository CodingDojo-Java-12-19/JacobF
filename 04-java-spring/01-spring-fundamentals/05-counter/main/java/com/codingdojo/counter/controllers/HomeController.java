package com.codingdojo.counter.controllers;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {
	
	private int getSessionCount(HttpSession s) {
		Object sCount = s.getAttribute("count");
		if(sCount == null) {
			setSessionCount(s, 0);
			sCount = s.getAttribute("count");
		}
		return (Integer)sCount;
	}
	
	private void setSessionCount(HttpSession s, int val) {
		s.setAttribute("count", val);
	}
	
	@RequestMapping("/")
	public String Index(HttpSession s) {
		int currCount = getSessionCount(s);
		setSessionCount(s, ++currCount);
		return "index.jsp";
	}
	
	@RequestMapping("/plus2")
	public String plus2(HttpSession s) {
		int t = 2;
		int currCount = getSessionCount(s);
		currCount += t;
		setSessionCount(s, currCount);
		return "redirect:/counter";
	}
	
	@RequestMapping("/plus5")
	public String plus5(HttpSession s) {
		int t = 5;
		int currCount = getSessionCount(s);
		currCount += t;
		setSessionCount(s, currCount);
		return "redirect:/counter";
	}
	
	@RequestMapping("/reset")
	public String Reset(HttpSession s) {
		s.invalidate();
		return "redirect:/counter";
	}
	
	@RequestMapping("/counter")
	public String Counter(HttpSession s, Model model) {
		model.addAttribute("count", getSessionCount(s));
		return "counter.jsp";
	}
	
}
