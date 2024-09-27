package com.example.Rest.StudentApplication.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.Rest.StudentApplication.model.Student;
import com.example.Rest.StudentApplication.repository.StudentRepository;

@Service
public class StudentService {
	
	@Autowired
	private StudentRepository studentRepository;
	
	public Student registerStudent(Student student) {
	return studentRepository.save(student);
	}

	public List<Student> getStudents(){
		return studentRepository.findAll();
	}
	
}
