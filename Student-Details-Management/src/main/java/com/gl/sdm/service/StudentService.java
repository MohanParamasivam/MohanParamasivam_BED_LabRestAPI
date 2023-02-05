package com.gl.sdm.service;

import java.util.List;

import com.gl.sdm.entity.Student;

public interface StudentService {

	public List<Student> findAll();

	public Student findById(int theId);

	public void save(Student theStudent);

	public void viewStudentById(int theId);

	public void deleteById(int theId);

}