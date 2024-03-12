package com.java.employeewage;

import java.util.Random;

public class Employee_wage {
	final static int Is_Full_Time=1;
	final static int Is_Part_Time=2;
	final static int Is_Absent=0;
	final static int Emp_rate_per_Hour=20;
	final static int NoofWorkingDays=20;
	final static int maxHrs=100;
	
	
	public static void main(String[] args) 
	{
		CalculateEmployeeWage calculateEmployeeWage=new CalculateEmployeeWage();
		System.out.println("Employee Daily wage is : "+calculateEmployeeWage.calculatewage());
	}

}
