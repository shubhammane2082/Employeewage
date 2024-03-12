package com.java.employeewage;

import java.util.Random;

public class CalculateEmployeeWage 
{
	final static int Is_Full_Time=1;
	final static int Is_Part_Time=2;
	final static int Is_Absent=0;
	
	private String company;
	private int Emp_rate_per_Hour;
	private int NoofWorkingDays;
	private int maxHrs;
	
	public CalculateEmployeeWage(String company, int Emp_rate_per_Hour, int NoofWorkingDays, int maxHrs)
	{
		this.company=company;
		this.Emp_rate_per_Hour=Emp_rate_per_Hour;
		this.NoofWorkingDays=NoofWorkingDays;
		this.maxHrs=maxHrs;
	}
	
	
	public int calculatewage()
	{
		System.out.println("Employee Company Name is : "+company);
		System.out.println("Employee Wage per Hour is : "+Emp_rate_per_Hour);
		System.out.println("No. of day employee working is : "+NoofWorkingDays);
		System.out.println("Maximum Hours Employee Works is : "+maxHrs);
		System.out.println();
        int empHrs=0,employeeWage=0;
		
		Random randomcheck=new Random();
		int day=1;
		while(NoofWorkingDays > day && maxHrs >= empHrs)
		{
           int empCheck=randomcheck.nextInt(3);
			
			switch(empCheck)
			{
			  case Is_Full_Time:
				empHrs += 8;
				break;
				
			  case Is_Part_Time:
					empHrs +=4;
					break;
					
			  case Is_Absent:
					empHrs+=0;
					break;
			}
		}
//		System.out.println("No. of Hours Employee Work is : "+empHrs);
		employeeWage=empHrs*Emp_rate_per_Hour;
		System.out.println(company+" Employee Wage Per Month is : "+employeeWage);
		System.out.println();
		return employeeWage;
	}

}
