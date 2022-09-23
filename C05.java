package com.collections.demo;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class C05 {
	
	static List<Employee> employee = new ArrayList<Employee>();
	
	static {
		employee.add(new Employee("loki","loki",500.50,List.of("project 1","priject 2","projects 3")));
		
		employee.add(new Employee("nithish","loki",200.50,List.of("project 1","priject 2","projects 3")));

		employee.add(new Employee("boss","loki",100.50,List.of("project 1","priject 2","projects 3")));

		
	
	}

	public static void main(String[] args) {

	employee.stream().forEach(t->System.out.println(t));
	
	List<Employee> listdata = employee.stream()
	.map(t->new Employee(t.getF_name(),t.getL_name(),t.getSalary()*10,t.getProjects()))
	.collect(Collectors.toList());
	
	System.out.println(listdata);
	
	System.out.println("*******************************************************");
	
	Employee emp=employee.stream()
.filter(t->t.getSalary() >10000)
.map(t->new Employee(t.getF_name(),t.getL_name(),t.getSalary()*10,t.getProjects()))

.findAny()
.orElse(null);
	System.out.println(emp);
	
	}
}
