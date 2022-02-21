package capgday3;

public class swap {
	public static void main(String[] args) {
		
		String s1 = "Rahul";
        String s2 = "Raj ";
          
        System.out.println("Initial Stings : a = " + 
                                       s1 + " and b = "+s2);
        s1 = s1 + s2;
        s2 = s1.substring(0,s1.length()-s2.length());
        
        s1 = s1.substring(s2.length());
        
        System.out.println("Swapped Strings: a = " + 
                                     s1 + " and b = " + s2);
	}
	

}
