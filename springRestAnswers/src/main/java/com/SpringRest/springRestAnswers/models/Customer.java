package com.SpringRest.springRestAnswers.models;

public class Customer {

	int id;
	String name;
	long contactNo;
	public Customer(int id, String name, long contactNo) {
		super();
		this.id = id;
		this.name = name;
		this.contactNo = contactNo;
	}
	public Customer() {
		super();
		// TODO Auto-generated constructor stub
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
	public long getContactNo() {
		return contactNo;
	}
	public void setContactNo(long contactNo) {
		this.contactNo = contactNo;
	}
	@Override
	public String toString() {
		return "Customer [id=" + id + ", name=" + name + ", contactNo=" + contactNo + "]";
	}
	
	
}
