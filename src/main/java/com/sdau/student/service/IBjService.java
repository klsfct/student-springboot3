package com.sdau.student.service;

import java.util.List;

import com.sdau.student.vo.Bj;

public interface IBjService {
public void add(Bj bj);
public void update(Bj bj);
public void delete(int id);
public Bj findBjById(int id);
public List<Bj> queryAll();
}
