package com.rf.zzc.demo1;

import java.util.Scanner;

public class Class {

	public static void main(String[] args) {
		/*
		 * ������ ����������ص㼰����
		 */
		// ͨ���ؼ���new����һ��person���󣬴���ʱ���õ��Ƕ����Ӧ�Ĺ��췽��
		Scanner scan=new Scanner(System.in);
		String str=scan.next();
		
		if("��".equals(str)){
			System.out.println("����պܺ�");
		}else{
			System.out.println("����ղ���");
		}
		Person per = new Person();
		per.age = 19;
		per.hand = 2;
		per.setHeight(1.8f);

		per.name = "Ф˧";// С˧�ᱻФ˧���
		per.speak();
		System.out.println(per.getHeight());
		System.out.println(per.hand);
		Rf1706 rf = new Rf1706();
		rf.age = 18;
		rf.height = 170.0f;
		rf.name = "�º�";
		
		Rf1706 rf1 = new Rf1706();
		rf1.age = 18;
		rf1.height = 170.0f;
		rf1.name = "�ս�";
		
		Rf1706 rf2 = new Rf1706();
		rf2.age = 18;
		rf2.height = 178.0f;
		rf2.name = "���γ�";
		
		Rf1706 rf3 = new Rf1706();
		rf3.age = 18;
		rf3.height = 170.0f;
		rf3.name = "Ф˧";

		Rf1706 rf4 = new Rf1706();
		rf4.age = 18;
		rf4.height = 170.0f;
		rf4.name = "��骽�";
		
		Rf1706 rf5 = new Rf1706();
		rf5.age = 18;
		rf5.height = 170.0f;
		rf5.name = "��ΰ";
		
		Rf1706 rf6 = new Rf1706();
		rf6.age = 18;
		rf6.height = 170.0f;
		rf6.name = "�ƻ�";
		
		Use u=new Use("�º�","123456","0");
		Use u1=new Use("�ս�","123456","0");
		Use u2=new Use("Ф˧","123456","0");
		Use u3=new Use("��骽�","123456","0");
		Use u4=new Use("��ΰ","123456","0");
		System.out.println(u);
		System.out.println(u1);
		System.out.println(u2);
		System.out.println(u3);
		System.out.println(u4);
		System.out.println(rf5);
		System.out.println(rf6);
		Person person9=new Person("����");
		Person person1=new Person();
		person1.name="666";
		Person person2=new Person("����");
		Person person3=new Person("����");
		Person person4=new Person("����");
		Person persons[]={person1,person2,person3,person4};
		Person persons1[]={new Person("����"),new Person("����"),new Person("����"),new Person("����")};
		System.out.println(person1);
	}
}
