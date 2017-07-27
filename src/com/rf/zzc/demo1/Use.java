package com.rf.zzc.demo1;

public class Use {
	//创建一个用户类，五个用户，有用户名。密码，余额属性
	String name;
	String keyword;
	String balance;
	
	public Use(String name,String keyword,String balance){
		this.name=name;
		this.keyword=keyword;
		this.balance=balance;
	}

	@Override
	public String toString() {
		return "Use [name=" + name + ", keyword=" + keyword + ", balance=" + balance + "]";
	}

}
