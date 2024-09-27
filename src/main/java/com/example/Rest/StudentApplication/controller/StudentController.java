package com.example.Rest.StudentApplication.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.Rest.StudentApplication.model.Student;
import com.example.Rest.StudentApplication.service.StudentService;


@RestController
public class StudentController {
	
	@Autowired
	private StudentService studentService;

	@PostMapping(value = "/registerStudent")
	public Student registerStudent(@RequestBody Student student) {
	return studentService.registerStudent(student);
	}
	
	@GetMapping(value = "/getStudents")
	public List<Student>getStudents(){
		return studentService.getStudents();
	}
	
	@GetMapping(value="/getstudent/{rollnumber}")
	public Student getstudent(@PathVariable("rollnumber") int rollnumber){
		return studentService.getStudentById(rollnumber);
	}

	
	
}
