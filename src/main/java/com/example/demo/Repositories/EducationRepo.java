package com.example.demo.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.Models.Education;

public interface EducationRepo extends JpaRepository<Education, Integer> {

}
