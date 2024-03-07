package com.java.employeewage;

import java.util.Random;

public class Employee_wage {
	final static int Is_Present=1;
	final static int Is_Absent=0;
	
	public static void main(String[] args) 
	{
		int empHrs=0;
		
		Random randomcheck=new Random();
		int empCheck=randomcheck.nextInt(2);


		if(empCheck == Is_Present)
		{
			System.out.println("Employee is present");
		}
		else {
			System.out.println("Employee is absent");
		}


	}

}
