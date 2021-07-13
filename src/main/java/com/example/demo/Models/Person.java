package com.example.demo.Models;

import java.text.Format;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.persistence.Transient;

import org.springframework.stereotype.Component;

import com.sun.istack.NotNull;

@Entity
@Component
@Table(name = "persons")
public class Person {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int reg_id;

	@NotNull
	private int institution_id;

	@NotNull
	private String teacher_student_roll;

	@NotNull
	private int id;

	@NotNull
	private String firstname;

	private String lastname;

	@NotNull
	private String reg_date;

	@NotNull
	private long age;

	@NotNull
	private String gender;

	@NotNull
	private String nid;

	@NotNull
	private String occupation;

	@NotNull
	private String addressTyp;

	@OneToOne(cascade = CascadeType.ALL, fetch=FetchType.EAGER)
	PersonAddress person_address;

	@NotNull
	private String contact_no;

	@NotNull
	private String email;

	@OneToMany(cascade = CascadeType.ALL)
	@JoinColumn(name="person_fk", referencedColumnName = "reg_id")
	private List<Education> education;

	@Transient
	SimpleDateFormat df=new SimpleDateFormat("dd/MM/yyyy  HH:mm:ss");
	
	
	@Column(nullable = true)
	private String created_on = df.format(new Date());
	@Column(nullable = true)
	private String created_by= "Ruhan";

	public Person() {
		super();
	}

	public Person(int reg_id, int institution_id, String teacher_student_roll, int id, String first_name,
			String last_name, String reg_date, long age, String gender, String nid, String occupation,
			String addressTyp, PersonAddress person_address, String contact_no, String email,
			String created_on, String created_by) {
		super();
		this.reg_id = reg_id;
		this.institution_id = institution_id;
		this.teacher_student_roll = teacher_student_roll;
		this.id = id;
		this.firstname = first_name;
		this.lastname = last_name;
		this.reg_date = reg_date;
		this.age = age;
		this.gender = gender;
		this.nid = nid;
		this.occupation = occupation;
		this.addressTyp = addressTyp;
		this.person_address = person_address;
		this.contact_no = contact_no;
		this.email = email;
		this.education = education;
		this.created_on = created_on;
		this.created_by = created_by;
	}

	public int getReg_id() {
		return reg_id;
	}

	public void setReg_id(int reg_id) {
		this.reg_id = reg_id;
	}

	public int getInstitution_id() {
		return institution_id;
	}

	public void setInstitution_id(int institution_id) {
		this.institution_id = institution_id;
	}

	public String getTeacher_student_roll() {
		return teacher_student_roll;
	}

	public void setTeacher_student_roll(String teacher_student_roll) {
		this.teacher_student_roll = teacher_student_roll;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getReg_date() {
		return reg_date;
	}

	public void setReg_date(String reg_date) {
		this.reg_date = reg_date;
	}

	public long getAge() {
		return age;
	}

	public void setAge(long age) {
		this.age = age;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getNid() {
		return nid;
	}

	public void setNid(String nid) {
		this.nid = nid;
	}

	public String getOccupation() {
		return occupation;
	}

	public void setOccupation(String occupation) {
		this.occupation = occupation;
	}

	public String getAddressTyp() {
		return addressTyp;
	}

	public void setAddressTyp(String addressTyp) {
		this.addressTyp = addressTyp;
	}

	public String getContact_no() {
		return contact_no;
	}

	public void setContact_no(String contact_no) {
		this.contact_no = contact_no;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getCreated_on() {
		return created_on;
	}

	public void setCreated_on(String created_on) {
		this.created_on = created_on;
	}

	public String getCreated_by() {
		return created_by;
	}

	public void setCreated_by(String created_by) {
		this.created_by = created_by;
	}

	public PersonAddress getPerson_address() {
		return person_address;
	}

	public List<Education> getEducation() {
		return education;
	}

	public String getFirstname() {
		return firstname;
	}

	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}

	public String getLastname() {
		return lastname;
	}

	public void setLastname(String lastname) {
		this.lastname = lastname;
	}

	
	

}
