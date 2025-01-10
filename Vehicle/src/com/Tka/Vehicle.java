package com.Tka;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity

public class Vehicle {
	@Id
	private int id;
	private String name;
	private String color;
	private String model;
	
	@Override
	public String toString() {
		return "Vehicle [id=" + id + ", name=" + name + ", color=" + color + ", model=" + model + "]";
	}
	public Vehicle() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Vehicle(int id, String name, String color, String model) {
		super();
		this.id = id;
		this.name = name;
		this.color = color;
		this.model = model;
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
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	
	
	

}
