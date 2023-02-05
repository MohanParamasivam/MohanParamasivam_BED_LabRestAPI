package com.gl.sdm.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.gl.sdm.entity.Student;

public interface StudentRepository extends JpaRepository<Student, Integer> {

}
