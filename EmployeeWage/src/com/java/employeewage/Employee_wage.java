package com.java.employeewage;

import java.util.Random;

public class Employee_wage 
{
	public static void main(String[] args) 
	{
		CalculateEmployeeWage TCSEmployeeWage=new CalculateEmployeeWage("TCS", 120, 20, 120);
		TCSEmployeeWage.calculatewage();
		
		CalculateEmployeeWage wiproEmployeeWage=new CalculateEmployeeWage("Wipro", 140, 25, 140);
		wiproEmployeeWage.calculatewage();
		
	}

}
