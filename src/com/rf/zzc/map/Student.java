package com.rf.zzc.map;

import java.util.Comparator;

public class Student implements Comparable<Student> {
	private String name;
	private int age;

	public Student() {

	}

	public Student(String name, int age) {
		this.age = age;
		this.name = name;
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

	@Override
	public String toString() {
		return "Student [name=" + name + ", age=" + age + "]";
	}

	public void setAge(int age) {
		this.age = age;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + age;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Student other = (Student) obj;
		if (age != other.age)
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}

	@Override
	public int compareTo(Student o) {
		int num = this.getName().compareTo(o.getName());
		if (num != 0) {
			return num;

		} else {
			if (this.getAge() < o.getAge()) {
				return -1;
			} else {
				return 1;
			}
		}
	}

}
