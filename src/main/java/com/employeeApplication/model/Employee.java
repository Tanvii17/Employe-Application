package com.employeeApplication.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name = "employees")
public class Employee {
	
	@Id
	@GeneratedValue(strategy =  GenerationType.IDENTITY)
	private long id;
	private String employee_name;
	private String employee_designation;
	private double emloyee_salary;



	public long getId() {

		return id;
	}

	public void setId(long id) {

		this.id = id;
	}


	public String getEmployee_name() {

		return employee_name;
	}

	public void setEmployee_name(String employee_name) {
		this.employee_name = employee_name;
	}



	public String getEmployee_designation() {
		return employee_designation;
	}

	public void setEmployee_designation(String employee_designation) {
		this.employee_designation = employee_designation;
	}



	public double getEmloyee_salary() {
		return emloyee_salary;
	}

	public void setEmloyee_salary(double emloyee_salary) {
		this.emloyee_salary = emloyee_salary;
	}
}
