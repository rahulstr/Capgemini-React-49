package com.selfstudy;

public class operator {

	public static void main(String[] args) {
		double var1 = 20.00;
		double var2=80.00;
		
		double var3=(var1+var2)*100;
		
		double var4=var3 % 40.00;
		
		boolean var5;
		
		if(var4==0) {
			var5=true;
		}
		else {
			var5=false;
		}
		
		if(var5==true) {
			System.out.println("Got Some Remainder");
		}

	}

}