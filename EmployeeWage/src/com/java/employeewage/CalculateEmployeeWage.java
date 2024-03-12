package com.java.employeewage;

import java.util.Random;

public class CalculateEmployeeWage 
{
	final static int Is_Full_Time=1;
	final static int Is_Part_Time=2;
	final static int Is_Absent=0;
	final static int Emp_rate_per_Hour=20;
	final static int NoofWorkingDays=20;
	final static int maxHrs=100;
	
	public static int calculatewage()
	{
        int empHrs=0,employeeWage=0;
		
		Random randomcheck=new Random();
		int day=1;
		while(day <= NoofWorkingDays && maxHrs > empHrs)
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
		System.out.println("No. of Hours Employee Work is : "+empHrs);
		employeeWage=empHrs*Emp_rate_per_Hour;
		return employeeWage;
	}

}
