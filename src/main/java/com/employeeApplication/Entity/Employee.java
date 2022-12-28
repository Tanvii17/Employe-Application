package com.employeeApplication.Entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name = "employee_table")
public class Employee {
	
	@Id
	@GeneratedValue(strategy =  GenerationType.IDENTITY)
	private long id;
	private String employeeName;
	private String employeeDesignation;
	private int emloyeeSalary;



	public long getId() {

		return id;
	}

	public void setId(long id) {

		this.id = id;
	}


	public String getEmployeeName() {

		return employeeName;
	}

	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}



	public String getEmployeeDesignation() {
		return employeeDesignation;
	}

	public void setEmployeeDesignation(String employeeDesignation) {
		this.employeeDesignation = employeeDesignation;
	}



	public int getEmloyeeSalary() {
		return emloyeeSalary;
	}

	public void setEmloyeeSalary(int emloyeeSalary) {
		this.emloyeeSalary = emloyeeSalary;
	}
}
