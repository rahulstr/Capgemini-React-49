package com.capgedayone;

class pen1{
	public String toString() {
		return "Pen Manufacturer: "+name+'\n'+"Pen Model Number: "+model+'\n'+"Year of Manufacture: "+yom+'\n'+"Car Body Type: "+type+'\n'+"Ink Color: "+color;
		
	}
	public pen1(String name,int model,int yom,String type,String color){
		this.name=name;
		this.model=model;
		this.yom=yom;
		this.type=type;
		this.color=color;
		
	}
	
	private String name;
	private int model;
	private int yom;
	private String type;
	private String color;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getModel() {
		return model;
	}
	public void setModel(int model) {
		this.model = model;
	}
	public int getYom() {
		return yom;
	}
	public void setYom(int yom) {
		this.yom = yom;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}

	
	
}

public class Pen {

	public static void main(String[] args) {
		pen1 p=new pen1("Reynolds",367,2021,"Gel","Blue");
		System.out.println(p);

	}

}
