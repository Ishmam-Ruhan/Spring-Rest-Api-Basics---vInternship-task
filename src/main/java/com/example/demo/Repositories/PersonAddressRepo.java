package com.example.demo.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.Models.PersonAddress;

public interface PersonAddressRepo extends JpaRepository<PersonAddress, Integer>{

}
