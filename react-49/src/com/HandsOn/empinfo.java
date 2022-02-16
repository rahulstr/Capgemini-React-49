package com.HandsOn;

public class empinfo {
	
	private long empid;
	private String empname;
	private float basicpay;
	private int days;
	private float salary;
	private int holidays;
	private int sallowance;
	private float tax;

	public void setEmpid(long empid) {
		this.empid=empid;
	}
	public long getEmpid() {
		return this.empid;
	}
	public void setEmpname(String empname) {
		this.empname=empname;
	}
	public String getEmpname() {
		return this.empname;
	}
	public void setBasicpay(float empid) {
		this.basicpay=basicpay;
	}
	public float getBasicpay() {
		return this.basicpay;
	}
	public void setDays(int days) {
		this.days=days;
	}
	public int getDays() {
		return this.days;
	}
	public void setSalary(float salary) {
		this.salary=salary;
	}
	public float getSalary() {
		return this.salary;
	}
	public void setHolidays(int holidays) {
		this.holidays=holidays;
	}
	public int getHolidays() {
		return this.holidays;
	}
	public void setSallowance(int sallowance) {
		this.sallowance=sallowance;
	}
	public int getSallowance() {
		return this.sallowance;
	}
	public void setTax(float tax) {
		this.tax=tax;
	}
	public float getTax() {
		return this.tax;
	}

}