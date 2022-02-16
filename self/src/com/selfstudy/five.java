package com.selfstudy;

import java.util.Scanner;

public class five {
	public static void main(String[] args) {
		Scanner p = new Scanner(System.in);
		System.out.println("Enter the Starting Number: ");
		int a = p.nextInt();
		System.out.println("Enter the Ending Number: ");
		int b = p.nextInt();

		five obj = new five();
		obj.printdescending(a, b);
	}

	public static void printdescending(int a, int b) {
		for (int i = (b - 1); i > a; i--) {
			System.out.println(i);
		 }
	 }
}