package com.sdau.student.controller;

import java.util.List;

import javax.annotation.Resource;
import javax.servlet.http.HttpServlet;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sdau.student.service.IBjService;
import com.sdau.student.service.IStudentService;
import com.sdau.student.vo.Bj;
import com.sdau.student.vo.Student;

/**
 * Servlet implementation class StudentServlet
 */
@RestController
@RequestMapping("/student")
public class StudentController {
	public static final long serialVersionUID = 1L;
	@Resource(name="studentService")
	IStudentService studentService;
	@Resource(name="bjService")
	IBjService bjService;
    /**
     * @see HttpServlet#HttpServlet()
     */
    public StudentController() {
        super();
        // TODO Auto-generated constructor stub
    }

    @RequestMapping("/list")
	public List<Student> list(){
		
		try {
			List<Student> studentList=studentService.queryAll();
			return studentList;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return null;
		}
	}
	
	@RequestMapping("/add")
	public String add(Student student){
		
		try {
				
			studentService.add(student);
			
		    return "添加成功";
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return e.toString();
		}
	}
	
	
	@RequestMapping("/update")
	public String update(Student student,Model model){
		
		try {			
			studentService.update(student);
			
		return "修改成功";
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return e.toString();
		}
	}
	@RequestMapping("/delete")
	public String delete(int id){
		
		try {
			studentService.delete(id);
			return "删除成功";
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return e.toString();
		}
	}
	

}
