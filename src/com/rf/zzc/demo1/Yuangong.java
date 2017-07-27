package com.rf.zzc.demo1;

public class Yuangong {
	private String name;
	private String num;
	private String money;
	public Yuangong(){
		
	}

	public Yuangong(String name, String num, String money) {
		
		this.name = name;
		this.num = num;
		this.money = money;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getNum() {
		return  num;
	}

	public void setNum(String num) {
		this.num = num;
	}

	public String getMoney() {
		return money;
	}

	public void setMoney(String money) {
		this.money = money;
	}
	public static void main(String[] args) {
		Yuangong yg=new Yuangong("zhou","123","1000"); 
		System.out.println(yg.name);
	}

	@Override
	public String toString() {
		return "Chouxiang [name=" + name + "]";
	}

}
