package com.map.manytomany;

import java.util.List;

import javax.persistence.*;

@Entity
public class emp {
	@Id
	private int eid;
	private String name;
	@ManyToMany
	private List<project> projects;
	public emp() {
		super();
		// TODO Auto-generated constructor stub
	}
	public emp(int eid, String name, List<project> projects) {
		super();
		this.eid = eid;
		this.name = name;
		this.projects = projects;
	}
	public int getEid() {
		return eid;
	}
	public void setEid(int eid) {
		this.eid = eid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public List<project> getProjects() {
		return projects;
	}
	public void setProjects(List<project> projects) {
		this.projects = projects;
	}
}
