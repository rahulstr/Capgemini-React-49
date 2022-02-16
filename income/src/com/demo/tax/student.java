package com.demo.tax;

public class student {
	public static void main(String[] args) {
		
		int studentClass = 10;
		int marks= 90 ;
		System.out.println(caluclatescholarship(studentClass , marks));
		
	}
	public static int caluclatescholarship(int studentClass, int marks) {
		int scholarship=0;
		int a=studentClass;
		switch (a) {
		case 10:
			scholarship = marks * 15000/100;
			break;
		case 11:
			scholarship = marks * 25000/100;
			break;
		case 12:
			scholarship = marks * 30000/100;
			break;
		default:
			scholarship = marks * 15000/100;
			
			
		}
		
		
		return scholarship;
	}
	
	
}