package com.example.demo.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestClientException;

import com.example.demo.Models.Person;
import com.example.demo.Models.PersonAddress;
import com.example.demo.Repositories.EducationRepo;
import com.example.demo.Repositories.PersonAddressRepo;
import com.example.demo.Repositories.PersonRepo;
import com.example.demo.service.PersonService;


@RestController
public class MainController {
	@Autowired
	PersonService ps;
	
	@GetMapping("/test")
	public String test(){
		return ps.test();
	}
	
	
	@GetMapping("api/v1/users/")
	public List<Person> allPerson(){
		return ps.allPerson();
	}
	
	
	@PostMapping("api/v1/users/add")
	public String addPerson(@RequestBody Person person) {
		return ps.addPerson(person);
	}
	
	
	@GetMapping("api/v1/users/id/{id}")
	public Optional<Person> findbyID(@PathVariable int id) {
		return ps.personfindbyID(id);
	}
	
	
	@GetMapping("api/v1/users/name/{firstname}")
	public List<Person> findbyName(@PathVariable String firstname) {
		return ps.personfindbyName(firstname);
	}
	
	
	
	@GetMapping("api/v1/users/delete/{id}")
	public String deletebyID(@PathVariable int id) {
		return ps.personDeletebyID(id);
	}
	
	@GetMapping("api/v1/users/delete/all")
	public String deleteallPerson() {
		return ps.deleteAllPerson();
	}
	
	
	
	@PutMapping("api/v1/users/update")
	public Person updatedID(@RequestBody Person person) {
		return ps.personUpdate(person);
	}
	
}
