package capgday3;

public class remove {

	static void rmvChar(String s, char c) {
		int j, count = 0, n = s.length();
		char[] t = s.toCharArray();
		for (int i = j = 0; i < n; i++) {
			if (t[i] != c)
				t[j++] = t[i];
			else
				count++;
		}

		while (count > 0) {
			t[j++] = '\0';
			count--;
		}

		System.out.println(t);
	}

	public static void main(String[] args) {
		String s = "Welcome to Capgemini I am Rahul Raj";
	    rmvChar(s, 'e');
	}

}
