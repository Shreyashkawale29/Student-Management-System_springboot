package com.tka.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;


@Entity
public class Student {
	
	@Id
	private int id;
	private String name;
	private int marks;
	private long phone;
	private String email;
	private String address;
	public Student(int id, String name, int marks, long phone, String email, String address) {
		super();
		this.id = id;
		this.name = name;
		this.marks = marks;
		this.phone = phone;
		this.email = email;
		this.address = address;
	}
	public long getPhone() {
		return phone;
	}
	public void setPhone(long phone) {
		this.phone = phone;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Student(int id, String name, int marks) {
		super();
		this.id = id;
		this.name = name;
		this.marks = marks;
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
	public int getMarks() {
		return marks;
	}
	public void setMarks(int marks) {
		this.marks = marks;
	}

	
}
