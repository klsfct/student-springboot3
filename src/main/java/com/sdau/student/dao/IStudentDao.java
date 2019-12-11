package com.sdau.student.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sdau.student.vo.Student;


public interface IStudentDao extends JpaRepository<Student,Integer>{
	 
}
