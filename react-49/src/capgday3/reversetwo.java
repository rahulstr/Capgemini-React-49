package capgday3;

import java.util.Scanner;

public class reversetwo {

	public static void main(String[] args) {
		String s;
		Scanner a = new Scanner(System.in);
		System.out.println("Enter a String : ");
		s = a.nextLine();
		System.out.println("Reversed String : ");
		for (int i = s.length(); i > 0; --i) {
			System.out.print(s.charAt(i - 1));
		}
	}
}