package com.sapient.aem.service;

import java.util.Scanner;

import com.sapient.aem.bean.Employee;

public class EmployeeServiceImpl implements EmployeeService {

	@Override
	public Employee getEmployeeDetails() {
		Scanner scanner = new Scanner(System.in);
		try {
			Employee employee= new Employee();
			
			System.out.println("Enter employee id: ");
			employee.setId(Integer.parseInt(scanner.nextLine()));
			System.out.println("Enter employee name: ");
			employee.setName(scanner.nextLine());
			System.out.println("Enter salary: ");
			employee.setSalary(Double.parseDouble(scanner.nextLine()));
			System.out.println("Enter designation: ");
			employee.setDesignation(scanner.nextLine());
			employee.setInsuranceScheme(this.getInsuranceScheme(employee));
			return employee;
		}catch(Exception e) {
			e.printStackTrace();
		}
		
		return null;


	}

	@Override
	public InsuranceScheme getInsuranceScheme(Employee employee) {
		try {

			if(employee.getSalary()>5000 && employee.getSalary()<20000 && employee.getDesignation().equalsIgnoreCase("System Assosiate")) {
				return InsuranceScheme.SchemeC;

			}else if(employee.getSalary()>=20000 && employee.getSalary()<40000 && employee.getDesignation().equalsIgnoreCase("Programmer")) {
				return InsuranceScheme.SchemeB;
			}else if(employee.getSalary()>=40000  && employee.getDesignation().equalsIgnoreCase("Manager")) {
				return InsuranceScheme.SchemeA;

			}else if(employee.getSalary()<5000  && employee.getDesignation().equalsIgnoreCase("Clerk")) {
				return InsuranceScheme.NoScheme;
			}else {
				return InsuranceScheme.NoScheme;
			}
			
		} catch (Exception e) {

			e.printStackTrace();
		}
		return null;
	}

	@Override
	public void displayDetails(Employee employee) {
		try {
			System.out.println("Empid"+employee.getId());
			System.out.println("Ename"+employee.getName());
			System.out.println("salary"+employee.getSalary());
			System.out.println("Designation"+employee.getDesignation());
			System.out.println("Insurance Scheme"+employee.getInsuranceScheme());
		}catch(Exception e) {
			e.printStackTrace();
		}

	}






}
