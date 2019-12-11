package com.sdau.student.service;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.sdau.student.dao.IStudentDao;
import com.sdau.student.vo.Student;
@Service(value="studentService")
public class StudentService implements IStudentService {
	@Resource(type=IStudentDao.class)
	IStudentDao studentDao;

	public void add(Student student) {
		// TODO Auto-generated method stub
		studentDao.save(student);
	}

	@Override
	public void update(Student student) {
		studentDao.save(student);

	}

	@Override
	public void delete(int id) {
		studentDao.deleteById(id);

	}

	@Override
	public Student findStudentById(int id) {
		// TODO Auto-generated method stub
		return studentDao.getOne(id);
	}

	@Override
	public List<Student> queryAll() {
		
		return studentDao.findAll();
	}

}
