package com.reactiveworks.model;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name="Employee")
public class Employee{
	
	private int empNo;
	private String name;
	private double salary;
	public int getEmpNo() {
		return empNo;
	}
	public void setEmpNo(int empNo) {
		this.empNo = empNo;
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
	
}


// converting of java obj into XML  ===> Marshalling