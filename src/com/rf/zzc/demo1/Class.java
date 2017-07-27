package com.rf.zzc.demo1;

import java.util.Scanner;

public class Class {

	public static void main(String[] args) {
		/*
		 * 对象概念？ 对象的属性特点及方法
		 */
		// 通过关键字new创建一个person对象，创建时调用的是对象对应的构造方法
		Scanner scan=new Scanner(System.in);
		String str=scan.next();
		
		if("李".equals(str)){
			System.out.println("这个姓很好");
		}else{
			System.out.println("这个姓不行");
		}
		Person per = new Person();
		per.age = 19;
		per.hand = 2;
		per.setHeight(1.8f);

		per.name = "肖帅";// 小帅会被肖帅替代
		per.speak();
		System.out.println(per.getHeight());
		System.out.println(per.hand);
		Rf1706 rf = new Rf1706();
		rf.age = 18;
		rf.height = 170.0f;
		rf.name = "陈豪";
		
		Rf1706 rf1 = new Rf1706();
		rf1.age = 18;
		rf1.height = 170.0f;
		rf1.name = "苏捷";
		
		Rf1706 rf2 = new Rf1706();
		rf2.age = 18;
		rf2.height = 178.0f;
		rf2.name = "周治臣";
		
		Rf1706 rf3 = new Rf1706();
		rf3.age = 18;
		rf3.height = 170.0f;
		rf3.name = "肖帅";

		Rf1706 rf4 = new Rf1706();
		rf4.age = 18;
		rf4.height = 170.0f;
		rf4.name = "林楠疆";
		
		Rf1706 rf5 = new Rf1706();
		rf5.age = 18;
		rf5.height = 170.0f;
		rf5.name = "罗伟";
		
		Rf1706 rf6 = new Rf1706();
		rf6.age = 18;
		rf6.height = 170.0f;
		rf6.name = "唐华";
		
		Use u=new Use("陈豪","123456","0");
		Use u1=new Use("苏捷","123456","0");
		Use u2=new Use("肖帅","123456","0");
		Use u3=new Use("林楠疆","123456","0");
		Use u4=new Use("罗伟","123456","0");
		System.out.println(u);
		System.out.println(u1);
		System.out.println(u2);
		System.out.println(u3);
		System.out.println(u4);
		System.out.println(rf5);
		System.out.println(rf6);
		Person person9=new Person("张三");
		Person person1=new Person();
		person1.name="666";
		Person person2=new Person("李四");
		Person person3=new Person("王五");
		Person person4=new Person("码子");
		Person persons[]={person1,person2,person3,person4};
		Person persons1[]={new Person("张三"),new Person("李四"),new Person("王五"),new Person("码子")};
		System.out.println(person1);
	}
}
