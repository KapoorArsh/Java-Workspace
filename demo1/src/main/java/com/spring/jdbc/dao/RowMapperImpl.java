package com.spring.jdbc.dao;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.spring.jdbc.entities.student;

public class RowMapperImpl implements RowMapper<student> {

	@Override
	public student mapRow(ResultSet rs, int rowNum) throws SQLException {
		student student = new student();
		student.setId(rs.getInt(1));
		student.setName(rs.getString(2));
		student.setCity(rs.getString(3));
		return student;
	}

}
