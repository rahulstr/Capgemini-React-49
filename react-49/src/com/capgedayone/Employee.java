package com.capgedayone;

class employee1{
	public String toString() {
		return "Employee Name: "+name+'\n'+"Emp ID: "+id+'\n'+ "Emp Designation: "+dsg+'\n'+"Working Domain: "+domain;
		
	}
	public employee1(String name,int id,String dsg,String domain){
		this.name=name;
		this.id=id;
		this.dsg=dsg;
		this.domain=domain;
		
	}
	
	private String name;
	private int id;
	private String dsg;
	private String domain;
	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getDsg() {
		return dsg;
	}
	public void setDsg(String dsg) {
		this.dsg = dsg;
	}
	public String getDomain() {
		return domain;
	}
	public void setDomain(String domain) {
		this.domain = domain;
	}

	
}

public class Employee {

	public static void main(String[] args) {
		employee1 e=new employee1("Rahul",454,"Analyst","Finance");
		System.out.println(e);
	}

}
