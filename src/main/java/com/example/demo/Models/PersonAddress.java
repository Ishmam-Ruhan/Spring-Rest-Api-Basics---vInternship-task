package com.example.demo.Models;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import org.springframework.stereotype.Component;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Entity
@Component
@Table(name = "person_addresses")
public class PersonAddress {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int reg_id;
	private String street;
	private String post_office;
	private String upazila;
	private String district;
	private String division;

	public PersonAddress() {
		super();
	}

	public PersonAddress(int reg_id, String street, String post_office, String upazila, String district,
			String division) {
		super();
		this.reg_id = reg_id;
		this.street = street;
		this.post_office = post_office;
		this.upazila = upazila;
		this.district = district;
		this.division = division;
	}

	public int getReg_id() {
		return reg_id;
	}

	public void setReg_id(int reg_id) {
		this.reg_id = reg_id;
	}

	public String getStreet() {
		return street;
	}

	public void setStreet(String street) {
		this.street = street;
	}

	public String getPost_office() {
		return post_office;
	}

	public void setPost_office(String post_office) {
		this.post_office = post_office;
	}

	public String getUpazila() {
		return upazila;
	}

	public void setUpazila(String upazila) {
		this.upazila = upazila;
	}

	public String getDistrict() {
		return district;
	}

	public void setDistrict(String district) {
		this.district = district;
	}

	public String getDivision() {
		return division;
	}

	public void setDivision(String division) {
		this.division = division;
	}

}
