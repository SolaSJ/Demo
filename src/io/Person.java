package io;

public class Person implements Comparable<Person> {
	private int age;
	private String name;

	public Person(int age, String name) {
		super();
		this.age = age;
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
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
		Person other = (Person) obj;
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
	public String toString() {
		return "年龄为    " + age + "姓名为    " + name +"来自于";
	}

	@Override
	public int compareTo(Person o) {
		int num = this.getName().compareTo(o.getName());
		if (this.getAge() == o.getAge()) {
			return num;
		} else if (this.getAge() > o.getAge()) {
			return 1;
		} else
			return -1;

	}

}
