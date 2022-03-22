package com.SpringRest.springRestAnswers.models;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection="employees")
public class Employee {
@Id	
public long id;
String name;
String department;
String designantion;
int salary;
public Employee(long id, String name, String department, String designantion, int salary) {
	super();
	this.id = id;
	this.name = name;
	this.department = department;
	this.designantion = designantion;
	this.salary = salary;
}

public Employee() {
	super();
	// TODO Auto-generated constructor stub
}

public long getId() {
	return id;
}
public void setId(long id) {
	this.id = id;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getDepartment() {
	return department;
}
public void setDepartment(String department) {
	this.department = department;
}
public String getDesignantion() {
	return designantion;
}
public void setDesignantion(String designantion) {
	this.designantion = designantion;
}
public int getSalary() {
	return salary;
}
public void setSalary(int salary) {
	this.salary =  salary;
}
@Override
public String toString() {
	return "EmployeeDetails [id=" + id + ", name=" + name + ", department=" + department + ", designantion="
			+ designantion + ", salary=" + salary + "]";
}


}
