package com.example.demo.Repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.Models.Person;

public interface PersonRepo extends JpaRepository<Person, Integer>{

	List<Person> findByfirstname(String firstname);
}
