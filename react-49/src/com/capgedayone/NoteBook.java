package com.capgedayone;

class notebook1{
	public String toString() {
		return "Book Manufacturer: "+name+'\n'+"Book Size: "+size+" Note"+'\n'+"Number of Pages: "+num+" Pages"+'\n'+"Year of Manufacture: "+yom+'\n'+"Page Type: "+type+" Index";	
	}
	public notebook1(String name,String size,int num,int yom,String type) {
		this.name=name;
		this.size=size;
		this.num=num;
		this.yom=yom;
		this.type=type;
	}
	
	private String name;
	private String size;
	private int num;
	private int yom;
	private String type;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getSize() {
		return size;
	}
	public void setSize(String size) {
		this.size = size;
	}
	public int getNum() {
		return num;
	}
	public void setNum(int num) {
		this.num = num;
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
	
}

public class NoteBook {

	public static void main(String[] args) {
		notebook1 n=new notebook1("Classmate","Long",100,2020,"Plain");
		System.out.println(n);

	}

}
