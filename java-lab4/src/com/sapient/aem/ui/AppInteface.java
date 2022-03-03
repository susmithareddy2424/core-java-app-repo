package com.sapient.aem.ui;

import java.util.Scanner;

import com.sapient.aem.bean.Employee;
import com.sapient.aem.service.EmployeeService;
import com.sapient.aem.service.EmployeeServiceImpl;

public class AppInteface {
	private static final Integer SIZE=100;
	private static Employee employees[]=new Employee[SIZE];
	
	private static Scanner scanner=new Scanner(System.in);
	
	private static EmployeeService service=new EmployeeServiceImpl();

	public static void main(String[] args) {
		System.out.println("Enter number of employees upto maximum "+SIZE);
		int nemps=Integer.parseInt(scanner.nextLine());
		
		for(int i=0;i<nemps;i++) {
			employees[i]=service.getEmployeeDetails();
			
		}
		
		System.out.println("All employees details");
		
		for(int i=0;i<nemps;i++) {
			service.displayDetails(employees[i]);
			
		}

	}

}
