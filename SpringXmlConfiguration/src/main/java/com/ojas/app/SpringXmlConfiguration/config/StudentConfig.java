package com.ojas.app.SpringXmlConfiguration.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.ojas.app.SpringXmlConfiguration.model.Student;

@Configuration
public class StudentConfig {

	@Bean(value ="myStudent")
	public Student createStudent() {
		Student student = new Student();
		student.setName("Tarun");
		return student;
	}
}
