package com.HandsOn;

public class MainClass {

	public static void main(String[] args) {
		
		empinfo ob = new empinfo();
		ob.setBasicpay(5000);
		ob.setEmpid(57);
		ob.setDays(42);
		ob.setEmpname("Rahul");
		ob.setHolidays(1);
		ob.setSallowance(700);
		ob.setTax(4);
		salcal s = new salcal();
		empsal info = s.calculateTaxamount(ob);
		System.out.println("salary calculated=" + info.getTAxamount());

	}

}