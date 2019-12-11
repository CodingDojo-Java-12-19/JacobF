package com.codingdojo.driverslicense.services;

import java.util.List;

import org.springframework.stereotype.Service;

import com.codingdojo.driverslicense.models.License;
import com.codingdojo.driverslicense.models.Person;
import com.codingdojo.driverslicense.repositories.LicenseRepo;
import com.codingdojo.driverslicense.repositories.PersonRepo;

@Service
public class MainService {
	private final PersonRepo personRepo;
	private final LicenseRepo licenseRepo;
	
	public MainService(PersonRepo personRepo, LicenseRepo licenseRepo) {
		this.personRepo = personRepo;
		this.licenseRepo = licenseRepo;
	}
	
	public List<Person> allPersons() {
        return personRepo.findAll();
    }
	public Person getPerson(Long id) {
		return personRepo.findById(id).orElse(null);
	}
	public List<Person> getLicensedPeople() {
		return personRepo.findByLicenseIdNotNull();
	}
	public List<Person> getUnlicensedPeople() {
		return personRepo.findByLicenseIdIsNull();
	}
	public Person createPerson(Person p) {
		return personRepo.save(p);
	}
	public License createLicense(License l, Long recipientId) {
		l.setNumber(this.generateLicenseNumber());
		licenseRepo.save(l);
		Person recipient = personRepo.findById(recipientId).orElse(null);
		recipient.setLicense(l);
		return l;
	}
	public int generateLicenseNumber() {
		License l = licenseRepo.findTopByOrderByNumberDesc();
		if(l == null)
			return 1;
		int largestNumber = l.getNumber();
		largestNumber++;
		return (largestNumber);
	}
}
