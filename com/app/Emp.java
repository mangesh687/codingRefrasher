package com.app;

import java.util.Comparator;

public class Emp implements Comparator<Emp> {
	private int id;
	private String name;
	private String lastname;
	private int age;
	@Override
	public int compare(Emp o1, Emp o2) {
		// decending id
		return o2.id-o1.id;		
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getLastname() {
		return lastname;
	}
	public void setLastname(String lastname) {
		this.lastname = lastname;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	@Override
	public String toString() {
		return "Emp [id=" + id + ", name=" + name + ", lastname=" + lastname + ", age=" + age + "]";
	}
	public Emp(int id, String name, String lastname, int age) {
		super();
		this.id = id;
		this.name = name;
		this.lastname = lastname;
		this.age = age;
	}
	public Emp() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
}
