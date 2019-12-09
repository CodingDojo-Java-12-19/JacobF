package com.codingdojo.ninjagold.controllers;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class MainController {
	//PRIVATE METHODS
	private int getSessionGold(HttpSession s) {
		Object sGold = s.getAttribute("gold");
		if(sGold == null) {
			setSessionGold(s, 0);
			sGold = s.getAttribute("gold");
		}
		return (Integer)sGold;
	}
	private void setSessionGold(HttpSession s, int val) {
		s.setAttribute("gold", val);
	}
	@SuppressWarnings("unchecked")
	private ArrayList<String> getSessionMessages(HttpSession s) {
		Object sMessages = s.getAttribute("messages");
		if(sMessages == null) {
			ArrayList<String> messages = new ArrayList<String>();
			setSessionMessages(s, messages);
			sMessages = s.getAttribute("messages");
		}
		return (ArrayList<String>) sMessages;
	}
	private void setSessionMessages(HttpSession s, ArrayList<String> messages) {
		s.setAttribute("messages", messages);
	}
	//ROUTES
	@RequestMapping("/")
	public String index(Model model, HttpSession s) {
		model.addAttribute("goldCount", getSessionGold(s));
		ArrayList<String> sMessages = getSessionMessages(s);
		Collections.reverse(sMessages);
		model.addAttribute("messages", sMessages);
		return "index.jsp";
	}
	@RequestMapping(value="/gold/{location}", method=RequestMethod.POST)
	public String building(HttpSession s, @PathVariable("location") String location) {
		if(location.equals("farm")) {
			Integer currGold = getSessionGold(s);
			int random = (int) Math.floor(Math.random() * 10) + 10;
			currGold += random;
			setSessionGold(s, currGold);
			ArrayList<String> currMessages = getSessionMessages(s);
			Date timestamp = new Date();
			currMessages.add("You went to the farm and earned " + random + " gold!" + " (" + timestamp + ")");
			setSessionMessages(s, currMessages);
		}
		if(location.equals("cave")) {
			Integer currGold = getSessionGold(s);
			int random = (int) Math.floor(Math.random() * 5) + 5;
			currGold += random;
			setSessionGold(s, currGold);
			ArrayList<String> currMessages = getSessionMessages(s);
			Date timestamp = new Date();
			currMessages.add("You went to the cave and earned " + random + " gold!" + " (" + timestamp + ")");
			setSessionMessages(s, currMessages);
		}
		if(location.equals("house")) {
			Integer currGold = getSessionGold(s);
			int random = (int) Math.floor(Math.random() * 3) + 2;
			currGold += random;
			setSessionGold(s, currGold);
			ArrayList<String> currMessages = getSessionMessages(s);
			Date timestamp = new Date();
			currMessages.add("You went to the house and earned " + random + " gold!" + " (" + timestamp + ")");
			setSessionMessages(s, currMessages);
		}
		if(location.equals("casino")) {
			Integer currGold = getSessionGold(s);
			int chance = (int) Math.floor(Math.random() * 2);
			int random = (int) Math.floor(Math.random() * 50);
			if (chance == 1) {
				currGold += random;
				ArrayList<String> currMessages = getSessionMessages(s);
				Date timestamp = new Date();
				currMessages.add("Woohoo! You went to the casino and earned " + random + " gold!" + " (" + timestamp + ")");
				setSessionMessages(s, currMessages);
			} else {
				currGold -= random;
				ArrayList<String> currMessages = getSessionMessages(s);
				Date timestamp = new Date();
				currMessages.add("Oh no! You went to the casino and lost " + random + " gold!" + " (" + timestamp + ")");
				setSessionMessages(s, currMessages);
			}
			setSessionGold(s, currGold);
		}
		return "redirect:/";	
	}
	@RequestMapping("/reset")
	public String Reset(HttpSession s) {
		s.invalidate();
		return "redirect:/";
	}
}
