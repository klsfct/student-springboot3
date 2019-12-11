package com.sdau.student.service;

import java.util.List;

import com.sdau.student.vo.Student;



public interface IStudentService {
	public void add(Student student);
	public void update(Student student);
	public void delete(int id);
	public Student findStudentById(int id);
	public List<Student> queryAll();
}
