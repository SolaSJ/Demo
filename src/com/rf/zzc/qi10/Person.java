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

	// ��ΪHashset��Ҫ�ȱȽϹ��������Ƿ���ͬ�����equals�����Ƚ���һ�ֹ������룬����ͬ����ͬ��
//	���Ժ�Arrayset�ȽϵĻ�����Ҫ�ȸı丸���hash����ֵ���ٸı�equals����ıȽϷ���
	@Override
	public int hashCode() {
		// TODO Auto-generated method stub
		return 1;
	}

	@Override
	public boolean equals(Object obj) {
//	����obj instanceof Person���Է����	obj�Ƿ���Person�ĸ���Ķ���
		if (obj instanceof Person) {
//		ǿ������ת��������ת��
			Person p = (Person) obj;
			return this.name.equals(p.name) && this.age == p.age;
		}
		return false;
	}

	@Override//��дtostring��������Ȼ���ص���hashcode��
	public String toString() {
		return "Person [name=" + name + ", age=" + age + "]";
	}
}
