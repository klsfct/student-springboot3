package com.sdau.student.controller;

import java.util.List;

import javax.annotation.Resource;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sdau.student.service.IBjService;
import com.sdau.student.vo.Bj;

@RestController
@RequestMapping("/bj")
public class BjController  {
	private static final long serialVersionUID = 1L;
	@Resource(name="bjService")
    IBjService bjService;
    /**
     * @see HttpServlet#HttpServlet()
     */
    public BjController() {
    	
        super();
       
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	
    @RequestMapping("/list")
    public List<Bj> list(){
		
		
			List<Bj> bjList=bjService.queryAll();
			
		    return bjList;
		
	}
   
    @RequestMapping("/add")
	public String add(Bj bj){
    		
		try {
			
			bjService.add(bj);
			
		    return "添加成功";
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return e.toString();
		}
	}
  
    @RequestMapping("/update")
	public  String  update(Bj bj){
		
		try {
			bjService.update(bj);
			
			return "修改成功";
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return e.toString();
		}
	}
    @RequestMapping("/delete/{id}")
	public String delete(@PathVariable("id") int id){
				
		try {
			
			bjService.delete(id);	
			return "删除成功";			
			
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return e.toString();
		}
	}

	

}
