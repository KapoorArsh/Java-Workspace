package com.spring.jdbc.dao;

import java.util.List;

import com.spring.jdbc.entities.student;

public interface StudentDao {
	public int insert(student stu1);
	public int change(student stu1);
	public int delete(int id);
	public student getstudent(int id);
	public List <student> getAllStudents();
}
