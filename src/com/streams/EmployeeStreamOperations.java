package com.streams;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.concurrent.ConcurrentHashMap;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class EmployeeStreamOperations {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<Employee> employeeList = intiliseEmployees();
		
	//How many male and female employees are there in the organization?	
		Map<String, Long> genderCount = employeeList.stream().collect(Collectors.groupingBy(Employee:: getGender ,Collectors.counting() ));
		System.out.println("genderCount::"+ genderCount);
		
		//Print the name of all departments in the organization?
		List<String> deptlist = employeeList.stream().map(e -> e.getDepartment()).distinct().collect(Collectors.toList());
		System.out.println("deptlist::"+ deptlist);
		
		// What is the average age of male and female employees?
		Map<String, Double> genderAvgAge = employeeList.stream().collect(Collectors.groupingBy(Employee:: getGender , Collectors.averagingInt(Employee::getAge)));
		System.out.println("genderAvgAge::"+ genderAvgAge);
		
		//Get the details of highest paid employee in the organization
		Optional<Employee> Employee = employeeList.stream().collect(Collectors.maxBy(Comparator.comparingDouble(e -> e.getSalary())));
		System.out.println("Employee:::"+ Employee.get());
		
		//Get the names of all employees who have joined after 2015?
		List<String> namesList = employeeList.stream()
				.filter(e -> e.getYearOfJoining() > 2015)
				.map(e -> e.getName())
				.collect(Collectors.toList());
		System.out.println("namesList:::"+ namesList);
		
		//Count the number of employees in each department?
		Map<Object, Long> deptCount = employeeList.stream().collect(Collectors.groupingBy( e-> e.getDepartment() , Collectors.counting()));
		System.out.println("deptCount:::"+ deptCount);
		
		// What is the average salary of each department?
		Map<Object, Double> deptAvgSalMap = employeeList.stream().collect(Collectors.groupingBy(e->e.getDepartment(), Collectors.averagingDouble(e->e.getSalary())));
		System.out.println("deptAvgSalMap:::"+ deptAvgSalMap);
		
		//Get the details of youngest male employee in the product development department?
		Optional<com.streams.Employee> maleEmpDetails = employeeList.stream().filter(e ->e.getGender().equals("Male"))
			.filter(e ->e.getDepartment().equals("Product Development"))
			.min(Comparator.comparingInt(e -> e.getAge()));
		
		System.out.println("maleEmpDetails:::"+ maleEmpDetails);
		
		List<Employee> distinctEmployee  = employeeList.stream()
				.filter(distinctEmp( e -> ((com.streams.Employee) e).getName() +"-"+ ((com.streams.Employee) e).getSalary()))
				.collect(Collectors.toList());
		System.out.println("distinctEmployee:::"+ distinctEmployee);
		
	}




	private static Predicate<? super Employee> distinctEmp(Function object) {
		Map<String , Boolean> map = new ConcurrentHashMap<String, Boolean>();
		
		return t -> map.putIfAbsent((String) object.apply(t), Boolean.TRUE) == null;
	}




	public static List<Employee> intiliseEmployees() {

		List<Employee> employeeList = new ArrayList<Employee>();

		employeeList.add(new Employee(111, "Jiya Brein", 32, "Female", "HR", 2011, 25000.0));
		employeeList.add(new Employee(122, "Paul Niksui", 25, "Male", "Sales And Marketing", 2015, 13500.0));
		employeeList.add(new Employee(133, "Martin Theron", 29, "Male", "Infrastructure", 2012, 18000.0));
		employeeList.add(new Employee(144, "Murali Gowda", 28, "Male", "Product Development", 2014, 32500.0));
		employeeList.add(new Employee(155, "Nima Roy", 27, "Female", "HR", 2013, 22700.0));
		employeeList.add(new Employee(166, "Iqbal Hussain", 43, "Male", "Security And Transport", 2016, 10500.0));
		employeeList.add(new Employee(177, "Manu Sharma", 35, "Male", "Account And Finance", 2010, 27000.0));
		employeeList.add(new Employee(188, "Wang Liu", 31, "Male", "Product Development", 2015, 34500.0));
		employeeList.add(new Employee(199, "Amelia Zoe", 24, "Female", "Sales And Marketing", 2016, 11500.0));
		employeeList.add(new Employee(200, "Jaden Dough", 38, "Male", "Security And Transport", 2015, 11000.5));
		employeeList.add(new Employee(211, "Jasna Kaur", 27, "Female", "Infrastructure", 2014, 15700.0));
		employeeList.add(new Employee(222, "Nitin Joshi", 25, "Male", "Product Development", 2016, 28200.0));
		employeeList.add(new Employee(233, "Jyothi Reddy", 27, "Female", "Account And Finance", 2013, 21300.0));
		employeeList.add(new Employee(244, "Nicolus Den", 24, "Male", "Sales And Marketing", 2017, 10700.5));
		employeeList.add(new Employee(255, "Ali Baig", 23, "Male", "Infrastructure", 2018, 12700.0));
		employeeList.add(new Employee(266, "Sanvi Pandey", 26, "Female", "Product Development", 2015, 28900.0));
		employeeList.add(new Employee(277, "Jiya Brein", 31, "Male", "Product Development", 2012, 25000.0));

		return employeeList;
	}
}
