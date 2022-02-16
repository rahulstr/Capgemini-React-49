package com.selfstudy;

public class SimpleCalculator {
	
	double firstNumber;
	double secondNumber;
	
	
	public double getFirstNumber() {
		return firstNumber;
	}



	public void setFirstNumber(double firstNumber) {
		this.firstNumber = firstNumber;
	}



	public double getSecondNumber() {
		return secondNumber;
	}



	public void setSecondNumber(double secondNumber) {
		this.secondNumber =(int) secondNumber;
	}
	
	public double getAdditionResult() {
		double a=this.firstNumber+this.secondNumber;
		return a;
	}
	
	public double getSubtractResult() {
		double s=this.secondNumber-this.firstNumber;
		return s;
	}
	
	public double getMultiplicationResult() {
		double m=this.firstNumber*this.secondNumber;
		return m;
	}
	
	public double getDivisionResult() {
		double d=this.firstNumber/this.secondNumber;
		return d;
	}
	
	public static void main(String[] args) {
		
		SimpleCalculator calci=new SimpleCalculator();
		calci.setFirstNumber(5.0);
		calci.setSecondNumber(4);
		System.out.println("add="+calci.getAdditionResult());
		System.out.println("sub="+calci.getSubtractResult());
		calci.setFirstNumber(5.25);
		calci.setSecondNumber(2);
		System.out.println("mul="+calci.getMultiplicationResult());
		System.out.println("div="+calci.getDivisionResult());
		
	}
	
	

}
