package com.sapient.aem.ui;

import java.util.Scanner;

import com.sapient.aem.bean.Employee;
import com.sapient.aem.service.InsuranceScheme;

public class AppInteface {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		Employee employee=new Employee();
		
		System.out.println("Enter id");
		employee.setId(sc.nextInt());
		
		System.out.println("Enter name");
		employee.setName(sc.next());
		
		System.out.println("Enter Salary");
		employee.setSalary(sc.nextLong());
		
		System.out.println("Enter Designation");
		employee.setDesignation(sc.next());
		
		try {

			if(employee.getSalary()>5000 && employee.getSalary()<20000 && employee.getDesignation()=="System Assosiate") {
				employee.setInsuranceScheme(InsuranceScheme.SchemeC);

			}else if(employee.getSalary()>=20000 && employee.getSalary()<40000 && employee.getDesignation()=="Programmer") {
				employee.setInsuranceScheme(InsuranceScheme.SchemeB);
			}else if(employee.getSalary()>=40000  && employee.getDesignation()=="Manager") {
				employee.setInsuranceScheme(InsuranceScheme.SchemeA);
				
			}else if(employee.getSalary()<5000  && employee.getDesignation()=="Clerk") {
				employee.setInsuranceScheme(InsuranceScheme.NoScheme);
			}

		} catch (Exception e) {

			e.printStackTrace();
		}
		System.out.println(employee.getInsuranceScheme());
	

	}

}
