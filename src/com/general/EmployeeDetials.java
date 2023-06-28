package com.general;

public class EmployeeDetials implements Cloneable{

	
	public int empId;
	public int sal;
	public Address address ;
	
	@Override
	protected Object clone() throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		EmployeeDetials employeeDetials = (EmployeeDetials) super.clone();
		employeeDetials.address = (Address) address.clone(); 
		return employeeDetials;
	}

	
}
