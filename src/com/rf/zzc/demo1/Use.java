package com.rf.zzc.demo1;

public class Use {
	//����һ���û��࣬����û������û��������룬�������
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
