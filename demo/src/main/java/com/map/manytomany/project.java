package com.map.manytomany;

import java.util.List;

import javax.persistence.*;

@Entity
public class project {
	@Id
	private int pid;
	@Column(name="project_name")
	private String projectname;
	@ManyToMany
	private List <emp> emps;
	public int getPid() {
		return pid;
	}
	public void setPid(int pid) {
		this.pid = pid;
	}
	public String getProjectname() {
		return projectname;
	}
	public void setProjectname(String projectname) {
		this.projectname = projectname;
	}
	public List<emp> getEmps() {
		return emps;
	}
	public void setEmps(List<emp> emps) {
		this.emps = emps;
	}
	public project(int pid, String projectname, List<emp> emps) {
		super();
		this.pid = pid;
		this.projectname = projectname;
		this.emps = emps;
	}
	public project() {
		super();
		// TODO Auto-generated constructor stub
	}
	
}
