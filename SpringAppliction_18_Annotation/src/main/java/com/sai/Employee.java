package com.sai;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Employee {
	@Value("101")
	private int id;
	@Value("Venkat")
	private String name;
	@Value("30000.00")
	private double salary;
	
	public Employee() {
		System.out.println("this is Emp bean");
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



	public double getSalary() {
		return salary;
	}



	public void setSalary(double salary) {
		this.salary = salary;
	}



	public void printEmployeeData()
	{
		System.out.println(id);
		System.out.println(name);
		System.out.println(salary);
		
	}

}
