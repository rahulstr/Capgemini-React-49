package com.demo.tax;

public class IncomeTaxCalculator {
	
	public static void main(String[] args) {

		float basicpay=225000;
		boolean citizenship=true;
		
		float incomeTax = 10*basicpay/100;
		System.out.println("Income Tax of employee for amount " +basicpay+ " is "+ incomeTax);
		applyTax(incomeTax,basicpay);
		validatepay(incomeTax, citizenship);
		

	}
	public static void applyTax(float incomeTax, float basicpay) {
		float netPay= basicpay -  incomeTax;
		
		System.out.println("Net pay of the employee is "+ netPay);
	  }
	public static void validatepay(float basicpay, boolean citizen) {
		if(basicpay > 20000){
			citizen=true;			
		}
		else {
			citizen=false;
		}
		System.out.println("Salary and Citizenship Eligibility: "+ citizen);
		
	}

}