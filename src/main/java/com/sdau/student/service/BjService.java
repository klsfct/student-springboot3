package com.sdau.student.service;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.sdau.student.dao.IBjDao;
import com.sdau.student.vo.Bj;


@Service(value="bjService")
public class BjService implements IBjService {
	@Resource(type=IBjDao.class)
	IBjDao bjDao;

	public void add(Bj bj) {
		// TODO Auto-generated method stub
		bjDao.save(bj);
		}

	@Override
	public void update(Bj bj) {
		bjDao.save(bj);
	}

	@Override
	public void delete(int id) {
		bjDao.deleteById(id);

	}

	@Override
	public Bj findBjById(int id) {
		// TODO Auto-generated method stub
		return bjDao.getOne(id);
	}

	@Override
	public List<Bj> queryAll() {
		
		return bjDao.findAll();
	}

}
