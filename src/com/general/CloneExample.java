package com.general;

public class CloneExample {

	public static void main(String args[]) throws CloneNotSupportedException {
		
		EmployeeDetials e1 = new EmployeeDetials();
		e1.empId = 101;
		Address address = new Address();
		address.addressId = 1;
		e1.address = address;
		
		EmployeeDetials e2  = (EmployeeDetials) e1.clone();
		
		e2.empId =102;
		e2.address.addressId = 2;
		
		System.out.println(e1.empId + " --addressId is ::"+ e1.address.addressId );
		System.out.println(e2.empId + " --addressId is ::"+ e2.address.addressId );
	}
}
