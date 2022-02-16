package com.selfstudy;

import java.util.Scanner;

public class eight {
	public static void getprime(int k) {
		int init = 0;

		for (int i = 2; i < (k / 2 + 1); i++) {
			if (k % i == 0) {
				init++;
				break;
			}
		}
		if (init == 0) {
			System.out.print(k + " ");
		}

	}

	public static void main(String[] args) {

		Scanner pr = new Scanner(System.in);
		System.out.println("Enter the First no.: ");
		int a = pr.nextInt();
		System.out.println("Enter the Second no.: ");
		int b = pr.nextInt();
		eight probj = new eight();
		for (int i = a; i < b; i++) {
			probj.getprime(i);
		}
	}

}