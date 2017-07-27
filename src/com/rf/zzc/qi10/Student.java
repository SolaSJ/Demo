package com.rf.zzc.qi10;

import java.util.Comparator;

//������Ҫ����ȥʵ��comparator�ӿڣ���Ϊcomparator�������compar�����������Student�Ƕ���Ƚϵ����ͣ�
//����Ͳ���ǿת�ˣ�
public class Student implements Comparator<Student> {
	private String name;
	private int age;

	public Student(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}
//��ǰ����ô˶��󣨻��߷�����ʱ����������޲Σ���ԭ��ֻ���вι��죬���Դ˴�Ҫ��һ���޲�
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
	//����comparator��compare����,��Ϊ�����Ѿ����� ���������ͣ��������ﲻ���ж��ǲ�������Student������͵�ǿ��ת��
	public int compare(Student o1, Student o2) {
		Student stu1 = (Student) o1;
		Student stu2 = (Student) o2;
		String num1 = stu1.getName();
		String num2 = stu2.getName();
//		������num1<num2 ����-1����ʱnum1����num2 ��ǰ�棬��Ⱦͷ���0
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
