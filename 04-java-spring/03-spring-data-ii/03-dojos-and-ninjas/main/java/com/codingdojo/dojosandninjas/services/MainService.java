package com.codingdojo.dojosandninjas.services;

import java.util.List;

import org.springframework.stereotype.Service;

import com.codingdojo.dojosandninjas.models.Dojo;
import com.codingdojo.dojosandninjas.models.Ninja;
import com.codingdojo.dojosandninjas.repositories.DojoRepository;
import com.codingdojo.dojosandninjas.repositories.NinjaRepository;

@Service
public class MainService {
	private final NinjaRepository nRepo;
	private final DojoRepository dRepo;
	public MainService(NinjaRepository nRepo, DojoRepository dRepo) {
		this.nRepo = nRepo;
		this.dRepo = dRepo;
	}
	//ninjas
	public List<Ninja> allNinjas() {
		return nRepo.findAll();
	}
	public Ninja createNinja(Ninja n) {
		return nRepo.save(n);
	}
	//dojos
	public List<Dojo> allDojos() {
		return dRepo.findAll();
	}
	public Dojo createDojo(Dojo d) {
		return dRepo.save(d);
	}
	public Dojo getDojo(Long id) {
		return dRepo.findById(id).orElse(null);
	}
}
