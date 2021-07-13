package com.example.demo.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.client.RestClientException;

import com.example.demo.Models.Person;
import com.example.demo.Repositories.PersonRepo;

@Service
public class PersonService {
	@Autowired
	PersonRepo pr;
	
	public String test() {
		return "Hello World!!";
	}

	public List<Person> allPerson() {
		return pr.findAll();
	}

	public String addPerson(@RequestBody Person person) {
		try {
			pr.save(person);
			return "success";
		} catch (RestClientException ex) {
			return ex + "";
		}

	}

	public Optional<Person> personfindbyID(@PathVariable int id) {
		return pr.findById(id);
	}

	public List<Person> personfindbyName(@PathVariable String firstname) {
		return pr.findByfirstname(firstname);
	}

	public String personDeletebyID(@PathVariable int id) {
		try {
			pr.deleteById(id);
			return "Person Deletaion Success";
		} catch (Exception ex) {
			return "Id not found"+ex;
		}
	}

	public String deleteAllPerson() {
		try {
			pr.deleteAll();
			return "All Person Deletaion Success";
		} catch (RestClientException ex) {
			return ex + "";
		}
	}

	public Person personUpdate(@RequestBody Person person) {
		return pr.save(person);
	}
}
