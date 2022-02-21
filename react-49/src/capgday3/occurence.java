package capgday3;

public class occurence {

	public static void main(String[] args) {
		String s = "oojjddggaajjdiaaklfso";
		char search = 'a';

		int count = 0;
		for (int i = 0; i < s.length(); i++) {
			if (s.charAt(i) == search)
				count++;
		}

		System.out.println("The Character " + search + " occurs " + count + " times");
	}

}

