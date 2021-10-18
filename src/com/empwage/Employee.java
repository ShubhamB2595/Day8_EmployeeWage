package com.empwage;
/*
 * class for calculating the employee wage 
 */
public class Employee {

	// declaring constants
	static int WAGE_PER_HR = 20;
	
	//Main Method
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Welcome to employee wage computation Program");
		dailyWage();
	}
	
	//method for checking attendance
	private static int checkAttendance() {
		int workHrs = 0;
		int attendance = (int) Math.floor(Math.random() * 10 % 2);
		if (attendance == 1) {
			workHrs = 8;
			System.out.println("Employee is present");
			return workHrs;
		}
		else {
			workHrs = 0;
			System.out.println("Employee is absent");
			return workHrs;
		}
			
	}
	
	//method for calculating daily employee wage
	private static void dailyWage() {
		int workingHrs = checkAttendance();
		int wage = workingHrs * WAGE_PER_HR;
		System.out.println("Daily wage of employee is: " + wage);
		
	}
}
