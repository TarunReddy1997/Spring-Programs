package com.ojas.app.SpringXmlConfiguration;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.ojas.app.SpringXmlConfiguration.config.StudentConfig;
import com.ojas.app.SpringXmlConfiguration.model.Student;

public class StudentTest {
	public static void main(String[] args) {
		ApplicationContext context = new AnnotationConfigApplicationContext(StudentConfig.class);
		Student student = (Student) context.getBean("myStudent");
		System.out.println(student.dispName());
	}
}
