package com.codingdojo.routing.controllers;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/dojo")
public class DojoController {
	@RequestMapping("")
	public String dojo() {
		return "The Dojo is awesome!";
	}
	@RequestMapping("/{location}")
	public String location(@PathVariable("location") String location) {
		System.out.println(location);
		if (location == "burbank") {
			return "Burbank Dojo is located in Southern California";
		} 
		if (location == "san-jose") {
			return "SJ Dojo is the headquarters!";
		}
		return "There is no information about this dojo!";
	}
	
}
