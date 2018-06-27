package com.weddingasia.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.weddingasia.domain.Student;
import com.weddingasia.service.StudentService;

@RestController
public class StudentController {
	@Autowired
	private StudentService service;
	
	@RequestMapping(value="/addstudent", method=RequestMethod.POST)
	public String addStudent(@RequestBody Student student) {
		return service.addStudent(student);
	}
	
	@RequestMapping(value="/updatestudent", method=RequestMethod.PUT)
	public Student upadteStudent(@RequestBody Student student) {
		return service.updateStudent(student);
	}
	
	@RequestMapping(value="/getallstudent", method=RequestMethod.GET)
	public List<Student> getAllStudent() {
		return service.getAllStudent();
	}
	
	@RequestMapping(value="/studentbyid", method=RequestMethod.GET)
	public Student getStudentById(@RequestParam Integer id) {
		return service.getStudentById(id);
	}
	
	@RequestMapping(value="/deletebyid", method=RequestMethod.DELETE)
	public void deleteStudentById(@RequestParam Integer id) {
		service.deleteStudentById(id);
	}
}
