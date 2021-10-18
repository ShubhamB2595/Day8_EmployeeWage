package com.empwage;
/*
 * class for calculating the employee wage 
 */
public class Employee {

	// declaring constants
	static int WAGE_PER_HR = 20;
	static int MAX_WORK_DAYS = 20;
	static int MAX_WORK_HRS = 100;
	static final int FULL_TIME = 1;
	static final int PART_TIME = 2;
	
	//Main Method
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Welcome to employee wage computation Program");
		dailyWage();
	}
	
	//method for checking attendance
	private static int checkAttendance() {
		int workHrs = 0;
		int workDays = 0;
		while (workHrs <= MAX_WORK_HRS && workDays < MAX_WORK_DAYS) {
			workDays++;
			int attendance = (int) Math.floor(Math.random() * 10 % 3);
		
			switch(attendance) {
				case FULL_TIME:
					workHrs += 8;
				case PART_TIME:
					workHrs += 4;
				default:
					workHrs += 0;
			}
			System.out.println("Employee is present for day: " + workDays + " Working Hrs: " + workHrs);
		}
		return workHrs;	
	}
	
	//method for calculating daily employee wage
	private static void dailyWage() {
		int workingHrs = checkAttendance();
		int wage = workingHrs * WAGE_PER_HR;
		System.out.println("Wage for a month of employee is: " + wage);
		
	}
}
