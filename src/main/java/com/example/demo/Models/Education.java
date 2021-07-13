package com.example.demo.Models;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import org.springframework.stereotype.Component;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Entity
@Component
@Table(name = "person_education")
public class Education {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int reg_id;
	private String degree_name;
	private String institution;
	private String completion_year;
	private String grade;

	public Education() {
		super();
	}

	public Education(int reg_id, String degree_name, String institution, String completion_year, String grade
			) {
		super();
		this.reg_id = reg_id;
		this.degree_name = degree_name;
		this.institution = institution;
		this.completion_year = completion_year;
		this.grade = grade;
	}

	public int getReg_id() {
		return reg_id;
	}

	public void setReg_id(int reg_id) {
		this.reg_id = reg_id;
	}

	public String getDegree_name() {
		return degree_name;
	}

	public void setDegree_name(String degree_name) {
		this.degree_name = degree_name;
	}

	public String getInstitution() {
		return institution;
	}

	public void setInstitution(String institution) {
		this.institution = institution;
	}

	public String getCompletion_year() {
		return completion_year;
	}

	public void setCompletion_year(String completion_year) {
		this.completion_year = completion_year;
	}

	public String getGrade() {
		return grade;
	}

	public void setGrade(String grade) {
		this.grade = grade;
	}
	
}
