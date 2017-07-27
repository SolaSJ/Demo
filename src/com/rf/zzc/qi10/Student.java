package com.rf.zzc.qi10;

import java.util.Comparator;

//在这里要首先去实现comparator接口，因为comparator里面才有compar方法，这里的Student是定义比较的类型，
//后面就不用强转了，
public class Student implements Comparator<Student> {
	private String name;
	private int age;

	public Student(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}
//在前面调用此对象（或者方法）时，输入的是无参，而原本只有有参构造，所以此处要建一个无参
	public Student() {

	}

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

	@Override
	//覆盖comparator的compare方法,因为上面已经限制 了输入类型，所以这里不用判断是不是属于Student类和类型的强制转换
	public int compare(Student o1, Student o2) {
		Student stu1 = (Student) o1;
		Student stu2 = (Student) o2;
		String num1 = stu1.getName();
		String num2 = stu2.getName();
//		在这里num1<num2 返回-1，此时num1就在num2 的前面，相等就返回0
//		if (num1.length() < num2.length()) {
//			return -1;
//		} else if (num1.length() > num2.length()) {
//			return 1;
//
//		}
//		return 0;
		int num = new Integer(stu1.getName().length()).compareTo(new Integer(stu2.getName().length()));
	return num;
	}

	@Override
	public String toString() {
		return "Student [name=" + name + ", age=" + age + "]";
	}

}
