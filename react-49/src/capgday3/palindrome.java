package capgday3;

public class palindrome {
	static boolean isPalindrome(String str) {
		int i = 0, j = str.length() - 1;
		while (i < j) {
			if (str.charAt(i) != str.charAt(j)) {
				return false;
			}
			i++;
			j--;
		}

		return true;
	}

	public static void main(String[] args) {
		String str = "radar";
		 
        if (isPalindrome(str)) {
            System.out.print("Given String is a Palindrome");        	
        }
        else {
        	System.out.print("Given String is not a Palindrome");
        }
            
	}

}