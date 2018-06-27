package com.weddingasia.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.weddingasia.domain.Student;

@Repository
public interface Studentrepository extends JpaRepository<Student, Integer>{
	Student findStudentById(Integer id);
}
