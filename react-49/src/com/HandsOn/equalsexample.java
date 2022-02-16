package com.HandsOn;

public class equalsexample {

	public static void main(String[] args) {
		
		String s1 = new String("Welcome");
		String s2 = new String("Wel");
		String s3 = new String("welcome");
		
		System.out.println(s1.equals(s2));
		System.out.println(s1.equals(s3));
		
		System.out.println(s1==s2);
		System.out.println(s1==s3);
	

	}

}
