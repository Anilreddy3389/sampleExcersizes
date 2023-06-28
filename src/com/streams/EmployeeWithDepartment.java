package com.streams;

public class EmployeeWithDepartment {

	int id;

	String name;

	int salary;

	String city;

	Department department;

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

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public Department getDepartment() {
		return department;
	}

	public void setDepartment(Department department) {
		this.department = department;
	}

	public EmployeeWithDepartment(int id, String name, int salary, String city, Department department) {
		super();
		this.id = id;
		this.name = name;
		this.salary = salary;
		this.city = city;
		this.department = department;
	}

}
