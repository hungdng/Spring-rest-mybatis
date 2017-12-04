package com.hungta.service;

import java.util.List;

import com.hungta.entity.Student;

public interface StudentService {
	
	void insertStudent(Student student);

	List<Student> getAll();
}
