package com.HandsOn;

public class salcal {
	
	public empsal calculateTaxamount(empinfo info) {
		long taxamount = (long) ((info.getBasicpay() * info.getHolidays()) + (info.getSalary() * info.getHolidays()) * info.getTax() / 100);
		empsal salaryinfo = new empsal();
		salaryinfo.setEmpid(info.getEmpid());
		salaryinfo.setEmpname(info.getEmpname());
		salaryinfo.setTaxamount(taxamount);
		return salaryinfo;
	}
	
}