package capgday2;

public class Inheritance {

	public static void main(String[] args) {
		Mobile m=new Mobile();
		apple a=new apple("Iphone",8,128,48,"C Type");
		samsung s= new samsung("Galaxy",12,256,64,"Micro USB");
		a.setBrand("Apple");
		a.setPrice(93000);
		a.setSeller("Amazon");
		a.setYom(2019);
		
		s.setBrand("Samsung");
		s.setPrice(72000);
		s.setSeller("Flipkart");
		s.setYom(2021);
				
		System.out.println(a.getBrand());
		System.out.println(a.getModel());
		System.out.println(a.getCamera());
		System.out.println(a.getCharge());
		System.out.println(a.getPrice());
		System.out.println(a.getRam());
		System.out.println(a.getSeller());
		System.out.println(a.getStorage());
		System.out.println(a.getYom());
		
		System.out.println(" ");
		
		
		System.out.println(s.getBrand());
		System.out.println(s.getModel());
		System.out.println(s.getCamera());
		System.out.println(s.getCharge());
		System.out.println(s.getPrice());
		System.out.println(s.getRam());
		System.out.println(s.getSeller());
		System.out.println(s.getStorage());
		System.out.println(s.getYom());
		
	}

}
