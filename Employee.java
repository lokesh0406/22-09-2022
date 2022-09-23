package com.collections.demo;

import java.util.List;

public class Employee {

	  private String F_name;
	  private String L_name;
	  private double Salary;
	  private List<String>projects;
	  
	  
	  public Employee() {
		  
	  }


	public Employee(String f_name, String l_name, double salary, List<String> projects) {
		super();
		F_name = f_name;
		L_name = l_name;
		Salary = salary;
		this.projects = projects;
	}


	public String getF_name() {
		return F_name;
	}


	public void setF_name(String f_name) {
		F_name = f_name;
	}


	public String getL_name() {
		return L_name;
	}


	public void setL_name(String l_name) {
		L_name = l_name;
	}


	public double getSalary() {
		return Salary;
	}


	public void setSalary(double salary) {
		Salary = salary;
	}


	public List<String> getProjects() {
		return projects;
	}


	public void setProjects(List<String> projects) {
		this.projects = projects;
	}


	@Override
	public String toString() {
		return "Employee [F_name=" + F_name + ", L_name=" + L_name + ", Salary=" + Salary + ", projects=" + projects
				+ "]";
	}
	  
	  
	  
}
