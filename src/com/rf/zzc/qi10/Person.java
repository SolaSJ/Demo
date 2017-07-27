package com.rf.zzc.qi10;

public class Person {
	private String name;
	private int age;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public Person(String name, int age) {
		this.name = name;
		this.age = age;
	}

	// 因为Hashset是要先比较哈西克码是否相同后才用equals方法比较另一种哈西克码，都相同才相同，
//	所以和Arrayset比较的话，还要先改变父类的hash返回值，再改变equals里面的比较方法
	@Override
	public int hashCode() {
		// TODO Auto-generated method stub
		return 1;
	}

	@Override
	public boolean equals(Object obj) {
//	这里obj instanceof Person可以翻译成	obj是否是Person的父类的对象
		if (obj instanceof Person) {
//		强制类型转换，向下转型
			Person p = (Person) obj;
			return this.name.equals(p.name) && this.age == p.age;
		}
		return false;
	}

	@Override//重写tostring方法，不然返回的是hashcode码
	public String toString() {
		return "Person [name=" + name + ", age=" + age + "]";
	}
}
