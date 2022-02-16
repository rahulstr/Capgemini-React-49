package com.BasichandsOn;

class mob1{
	public String toString() {
		return "Brand Name: "+name+'\n'+"Model: "+mn+'\n'+ "Year of Manufacture: "+yom+'\n'+"RAM: "+ram+'\n'+"Storage: "+stg+" GB"+'\n'+"Camera: "+cam+" MegaPixels";
		
	}
	public mob1(String name,String mn,int yom,int ram,int stg,int cam){
		this.name=name;
		this.mn=mn;
		this.yom=yom;
		this.ram=ram;
		this.stg=stg;
		this.cam=cam;
		
	}
	
	private String name;
	private String mn;
	private int yom;
	private int ram;
	private int stg;
	private int cam;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getMn() {
		return mn;
	}
	public void setMn(String mn) {
		this.mn = mn;
	}
	public int getYom() {
		return yom;
	}
	public void setYom(int yom) {
		this.yom = yom;
	}
	public int getRam() {
		return ram;
	}
	public void setRam(int ram) {
		this.ram = ram;
	}
	public int getStg() {
		return stg;
	}
	public void setStg(int stg) {
		this.stg = stg;
	}
	public int getCam() {
		return cam;
	}
	public void setCam(int cam) {
		this.cam = cam;
	}

	
}
public class Mobile {

	public static void main(String[] args) {
		mob1 m=new mob1("OnePlus","Nord CE",2022,12,128,48);
		System.out.println(m);

	}

}
