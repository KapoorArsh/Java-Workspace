package com.spring.jdbc.dao;

import java.util.List;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

import com.spring.jdbc.entities.student;

public class StudentDaoimpl implements StudentDao {
private JdbcTemplate jdbcTemplate;

	public JdbcTemplate getjdbcTemplate() {
	return jdbcTemplate;
}

public void setjdbcTemplate(JdbcTemplate jdbcTemplate) {
	this.jdbcTemplate = jdbcTemplate;
}

	@Override
	public int insert(student stu1) {
		String query="insert into student1 (id,name,city) values (?,?,?)";
		int r = this.jdbcTemplate.update(query,stu1.getId(),stu1.getName(),stu1.getCity());
		return r;
	}

	@Override
	public int change(student stu1) {
		String query="update student1 set name=? ,city=? where id=?";
		int r = this.jdbcTemplate.update(query,stu1.getName(),stu1.getCity(),stu1.getId());
		return r;
	}

	@Override
	public int delete(int id) {
		String query="delete from student1 where id=?";
		int r = this.jdbcTemplate.update(query,id);
		return r;
	}

	@Override
	public student getstudent(int id) {
		//select single student data
		String query ="select * from student1 where id=?";
		RowMapper <student> rowMapper = new RowMapperImpl();
		student stu2 = this.jdbcTemplate.queryForObject(query, rowMapper, id);
		return stu2;
	}

	@Override
	public List<student> getAllStudents() {
		//selecting multiple students
		String query = "select * from student1";
		List <student> student = this.jdbcTemplate.query(query, new RowMapperImpl());
		return student;
	}
	
}
