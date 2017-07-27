package com.rf.zzc.map;

public class Person {

	
	private String num;
	private String name;
	@Override
	public String toString() {
		return "Person [num=" + num + ", name=" + name + "]";
	}
	public Person(){
		
	}
	public Person(String num, String name) {
		super();
		this.num = num;
		this.name = name;
	}
	public String getNum() {
		return num;
	}
	public void setNum(String num) {
		this.num = num;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
}
