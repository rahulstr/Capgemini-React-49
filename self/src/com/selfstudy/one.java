package com.selfstudy;

import java.util.Scanner;

public class one {
	public static void quarter(int i) {

		if(i==1 || i==2 || i==3) {
			System.out.println("Quarter 1");
		}
		else if (i==4 || i==5 || i==6) {
			System.out.println("Quarter 2");
		}
		else if (i==7 || i==8 || i==9) {
			System.out.println("Quarter 3");
		}
		else if (i==10 || i==11 || i==12) {
			System.out.println("Quarter 4");
		} else {
			System.out.println("Invalid Input");
		}
	}

	public static void main(String[] args) {
			Scanner cq = new Scanner(System.in);
			System.out.println("Enter the Number of the Desired Month : ");
			int i = cq.nextInt();

			one obj = new one();
			obj.quarter(i);
		}	

}