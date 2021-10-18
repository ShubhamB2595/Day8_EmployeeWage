package com.empwage;

public class Employee {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Welcome to employee wage computation Program");
		checkAttendance();
	}
	
	public static double checkAttendance() {
		double attendance = Math.floor(Math.random() * 10 % 2);
		System.out.println("Attendance of the employee is: " + attendance);
		return attendance;
	}
}
