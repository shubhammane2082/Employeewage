package com.java.employeewage;

import java.util.Random;

public class Employee_wage 
{
	public static void main(String[] args) 
	{
		CalculateEmployeeWage calculateEmployeeWage=new CalculateEmployeeWage();
		int TCSemployeeWage=CalculateEmployeeWage.calculatewage("TCS", 120, 20, 120);
		int WiproemployeeWage=CalculateEmployeeWage.calculatewage("Wipro", 150, 26, 130);
		int CapgemployeeWage=CalculateEmployeeWage.calculatewage("Capgemini", 180, 30, 150);
		

	}

}
