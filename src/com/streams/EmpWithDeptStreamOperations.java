package com.streams;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class EmpWithDeptStreamOperations {

	public static void main(String[] args) {
	
		List<EmployeeWithDepartment> empList = new ArrayList<>();
		

		empList.add(new EmployeeWithDepartment(1,"A",10,"AA", new Department("hr")));

		empList.add(new EmployeeWithDepartment(2,"B",100,"BB", new Department("finance")));

		empList.add(new EmployeeWithDepartment(3,"C",7654,"CC", new Department("payroll")));

		empList.add(new EmployeeWithDepartment(4,"D",6543,"DD", new Department("admin")));

		empList.add(new EmployeeWithDepartment(5,"E",2099,"EE", new Department("hr")));

		empList.add(new EmployeeWithDepartment(6,"F",5000,"FF",  new Department("finance")));

		empList.add(new EmployeeWithDepartment(7,"G",65411,"GG",  new Department("finance")));
		
		empList.stream().collect(Collectors.groupingBy(e-> e.getDepartment().getDeptName(), Collectors.counting())).forEach((k,v) -> System.out.println( k + "-" + v));
		
		//System.out.println("x:::"+x);

	}

	
}
