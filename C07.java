package com.collections.demo;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class C07 {

	static List<Employee> employee = new ArrayList<Employee>();
	
	static {
		
		employee.add(new Employee("Raj", "kamal", 3000.20, List.of("e-com projects","Ticketing project","web-design project","sysapp project")));

		employee.add(new Employee("raja", "k", 5000.20, List.of("e-com projects","Ticketing project","web-design project","sysapp project")));

		employee.add(new Employee("andorson", "s", 8000.20, List.of("e-com projects","Ticketing project","web-design project","sysapp project")));

		employee.add(new Employee("rajesh", "s", 10000.20, List.of("e-com projects","Ticketing project","web-design project","sysapp project")));
		
		employee.add(new Employee("kiruba", "k", 20000.20, List.of("e-com projects","Ticketing project","web-design project","sysapp project")));

		
	}
	
	
	
	
	public static void main(String[] args) {
		
		System.out.println(employee);
		
		employee.stream().forEach(System.out::println);
		
		System.out.println("**********************************************");
		
		
		List<Employee> listingempdetails = employee.stream().map(t-> new Employee(t.getF_name(), t.getL_name(),t.getSalary()*2,t.getProjects()))
				.collect(Collectors.toList());
		
		listingempdetails.stream().forEach(t-> System.out.println(t));
		
		System.out.println("********************************************");
		
        List<Employee> list2 = employee.stream().filter(t -> t.getSalary() > 10000).map(t -> new Employee(t.getF_name(), t.getL_name(), t.getSalary(), t.getProjects()))
       .collect(Collectors.toList());

		list2.stream().forEach(t->System.out.println(t));
		
		System.out.println("*************************************************");
		
		Employee emp= employee.stream().filter(t -> t.getSalary() > 10000).map(t -> new Employee(t.getF_name(), t.getL_name(), t.getSalary(), t.getProjects())
				).findFirst().get();
		
		System.out.println(emp);
		
	}

}
