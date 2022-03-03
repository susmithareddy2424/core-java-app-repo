package com.sapient.aem.service;

import com.sapient.aem.bean.Employee;

public class EmployeeServiceImpl implements EmployeeService {
	Employee employee=new Employee();

	@Override
	public void getEmployeeDetails() {
		employee.getId();
		employee.getName();
		employee.getSalary();
		employee.getDesignation();
		employee.getSalary();


	}

	@Override
	public void getInsuranceScheme() {
		employee.getInsuranceScheme();


	}

	@Override
	public void displayDetails() {

      System.out.println(employee.getName());
	}

}
