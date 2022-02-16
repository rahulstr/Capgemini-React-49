package com.HandsOn;

public class empsal {
	private long empid;
	private String empname;
	private long taxamount;

	private long getEmpid() {
		return empid;
	}

	public void setEmpid(long empid) {
		this.empid = empid;
	}

	public void setEmpname(String empname) {
		this.empname = empname;
	}

	public String getEmpname() {
		return this.empname;
	}

	public void setTaxamount(long taxamount) {
		this.taxamount = taxamount;
	}

	public long getTAxamount() {
		return this.taxamount;
	}
}