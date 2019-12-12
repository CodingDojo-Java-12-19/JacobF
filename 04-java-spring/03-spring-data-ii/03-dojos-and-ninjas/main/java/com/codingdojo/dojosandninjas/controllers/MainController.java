package com.codingdojo.dojosandninjas.controllers;

import java.util.List;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.codingdojo.dojosandninjas.models.Dojo;
import com.codingdojo.dojosandninjas.models.Ninja;
import com.codingdojo.dojosandninjas.services.MainService;

@Controller
public class MainController {
		private final MainService service;
		public MainController(MainService service) {
			this.service = service;
		}
		@RequestMapping("/")
		public String index(Model model) {
			return "index.jsp";
		}
		//dojos
		@RequestMapping("/dojos")
		public String dojoIndex(Model model) {
			List<Dojo> dojos = service.allDojos();
			model.addAttribute("dojos", dojos);
			return "dojoIndex.jsp";
		}
		@RequestMapping("/dojos/new")
		public String dojoFormPage(@ModelAttribute("dojo") Dojo dojo) {
			return "dojoFormPage.jsp";
		}
		@PostMapping("/dojos")
		public String createDojo(@Valid @ModelAttribute("dojo") Dojo dojo, BindingResult result) {
			if(result.hasErrors()) {
				return "dojoFormPage.jsp";
			}
			service.createDojo(dojo);
			return "redirect:/dojos";
		}
		@RequestMapping("/dojos/{id}")
		public String thisDojo(@PathVariable("id") Long id, Model model) {
			model.addAttribute("dojo", 	service.getDojo(id));
			return "dojoShowPage.jsp";
		}
		//ninjas
		@RequestMapping("/ninjas")
		public String ninjaIndex(Model model) {
			List<Ninja> ninjas = service.allNinjas();
			model.addAttribute("ninjas", ninjas);
			return "ninjaIndex.jsp";
		}
		@RequestMapping("/ninjas/new")
		public String ninjaFormPage(@ModelAttribute("ninja") Ninja ninja, Model model) {
			List<Dojo> dojos = service.allDojos();
			model.addAttribute("dojos", dojos);
			return "ninjaFormPage.jsp";
		}
		@PostMapping("/ninjas")
		public String createNinja(@Valid @ModelAttribute("ninja") Ninja ninja, BindingResult result) {
			if(result.hasErrors()) {
				return "ninjaFormPage.jsp";
			}
			service.createNinja(ninja);
			return "redirect:/";
		}
}
