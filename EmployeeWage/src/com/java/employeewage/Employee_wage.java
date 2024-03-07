package com.java.employeewage;

import java.util.Random;

public class Employee_wage {
	final static int Is_Full_Time=1;
	
	final static int Is_Absent=0;
	final static int Emp_rate_per_Hour=20;
	
	
	public static void main(String[] args) 
	{
		int empHrs=0,employeeWage=0;
		
		Random randomcheck=new Random();
		int empCheck=randomcheck.nextInt(2);


		if(empCheck == Is_Full_Time)
		{
			empHrs=8;
		}
		else 
		{
			empHrs=0; 
		}
		
		employeeWage=empHrs*Emp_rate_per_Hour;
		System.out.println("Employee Daily wage is "+employeeWage);

	}

}
