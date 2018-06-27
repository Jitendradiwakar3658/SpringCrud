package com.weddingasia.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.weddingasia.domain.Student;
import com.weddingasia.repository.Studentrepository;

@Service
public class StudentService {
	@Autowired
	private Studentrepository repository;
	
	public String addStudent(Student student) {
		Student students = repository.save(student);
		if(students!=null) {
			return "Added Successfully";
		}else {
			return "failed to save";
		}
	}

	public List<Student> getAllStudent() {
		return repository.findAll();
	}

	public Student updateStudent(Student student) {
		return repository.save(student);
	}

	public Student getStudentById(Integer id) {
		Student student = repository.findStudentById(id);
		if(student!=null) {
			return student;
		}else {
			throw new NullPointerException("Id does not exist!!!");
		}
	}

	public void deleteStudentById(Integer id) {
		repository.deleteById(id);
	}

}
