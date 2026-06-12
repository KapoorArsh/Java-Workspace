package com.spring.constructorinjection;

public class person {
	private int id;
	private String name;
	private certi certi;
	public person(int id, String name, certi certi) {
		super();
		this.id = id;
		this.name = name;
		this.certi=certi;
	}
	@Override
	public String toString() {
		return "person [id=" + id + ", name=" + name + ", certi=" + certi + "]";
	}
}
