package com.Tka;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class College {
	
	@Id
	private int id;
	private String c_name;
	private String c_department;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getC_name() {
		return c_name;
	}
	public void setC_name(String c_name) {
		this.c_name = c_name;
	}
	public String getC_department() {
		return c_department;
	}
	public void setC_department(String c_department) {
		this.c_department = c_department;
	}
	@Override
	public String toString() {
		return "College [id=" + id + ", c_name=" + c_name + ", c_department=" + c_department + "]";
	}
	public College() {
		super();
		// TODO Auto-generated constructor stub
	}
	public College(int id, String c_name, String c_department) {
		super();
		this.id = id;
		this.c_name = c_name;
		this.c_department = c_department;
	}
	
	 
	
}
