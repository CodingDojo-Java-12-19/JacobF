package com.codingdojo.driverslicense.controllers;

import java.util.List;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.codingdojo.driverslicense.models.License;
import com.codingdojo.driverslicense.models.Person;
import com.codingdojo.driverslicense.services.MainService;

@Controller
public class MainController {
	private final MainService service;
	public MainController(MainService service) {
		this.service = service;
	}
	@RequestMapping("/")
	public String Index(Model model) {
		List<Person> people = service.getLicensedPeople();
		model.addAttribute("persons", people);
		return "index.jsp";
	}
	@RequestMapping("/persons/{id}")
	public String ShowPerson(@PathVariable("id") Long id, Model model) {
		model.addAttribute("person", service.getPerson(id));
		return "show.jsp";
	}
	@RequestMapping("/persons/new")
	public String NewPerson(@ModelAttribute("person") Person person) {
		return "new.jsp";
	}
	@RequestMapping(value="/persons", method=RequestMethod.POST)
	public String CreatePerson(@Valid @ModelAttribute("person") Person person, BindingResult result) {
		if(result.hasErrors()) {
			return "new.jsp";
		}
		service.createPerson(person);
		return "redirect:/";
	}
	@RequestMapping("/licenses/new")
	public String NewLicense(@ModelAttribute("license") License license, Model model) {
		List<Person> unlicensed = service.getUnlicensedPeople();
		model.addAttribute("persons", unlicensed);
		return "newlicense.jsp";
	}
	@RequestMapping(value="/licenses", method=RequestMethod.POST)
	public String CreateLicense(@Valid @ModelAttribute("license") License license, @RequestParam("person") Long recipientId, BindingResult result) {
		if(result.hasErrors()) {
			return "newlicense.jsp";
		}
		service.createLicense(license, recipientId);
		return "redirect:/";
	}
}
