package com.capgedayone;

class car1{
	public String toString() {
		return "Car Manufacturer: "+name+'\n'+"Car Model: "+model+'\n'+"Year of Manufacture: "+yom+'\n'+"License Number: "+ln+'\n'+"Car Body Type: "+type;
		
	}
	public car1(String name,String model,int yom,String ln,String type) {
		this.name=name;
		this.model=model;
		this.yom=yom;
		this.ln=ln;
		this.type=type;
	}
	
	private String name;
	private String model;
	private int yom;
	private String ln;
	private String type;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	public int getYom() {
		return yom;
	}
	public void setYom(int yom) {
		this.yom = yom;
	}
	public String getLn() {
		return ln;
	}
	public void setLn(String ln) {
		this.ln = ln;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}

	
}

public class Car {

	public static void main(String[] args) {
		car1 c=new car1("Mercedez","AMG",2019,"KA03KE6083","XUV");
		System.out.println(c);

	}

}
