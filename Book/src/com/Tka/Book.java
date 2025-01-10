package com.Tka;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Book {
	@Id
	private int id;
	private String b_Name;
	private String b_Author;
	private String language;
	private int noOfPages;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getB_Name() {
		return b_Name;
	}
	public void setB_Name(String b_Name) {
		this.b_Name = b_Name;
	}
	public String getB_Author() {
		return b_Author;
	}
	public void setB_Author(String b_Author) {
		this.b_Author = b_Author;
	}
	public String getLanguage() {
		return language;
	}
	public void setLanguage(String language) {
		this.language = language;
	}
	public int getNoOfPages() {
		return noOfPages;
	}
	public void setNoOfPages(int noOfPages) {
		this.noOfPages = noOfPages;
	}
	@Override
	public String toString() {
		return "Book [id=" + id + ", b_Name=" + b_Name + ", b_Author=" + b_Author + ", language=" + language
				+ ", noOfPages=" + noOfPages + "]";
	}
	
	

}
