package com.rf.zzc.demo1;

public class Person {
	// ����
	int age;
	String name;
	private float height;// pravate�����η���˽�еģ������أ�ʹ�������޷�����
	int hand;

	public void speak() {// ע��û��static�ˣ������Ǿ�̬��
		// this������Ǳ�����˭���þ���˭
		System.out.println(this.name + "������һԱ");
	}

	// �����ṩ������ߵķ���
	// ����˽�е� pravate ���η� ֻ���ڱ��൱��ʹ��
	// ����
	public void setHeight(float f) {

		this.height = f;// �����õ�ֵ��ֵ����ǰ����
	}

	// �����ṩ��ȡ��ߵķ���
	public float getHeight() {
		return this.height;// ���ص�ǰ��������
	}

	// toStringת��Ϊ�ַ��������Ҳ������ǰ���������м��루toString())���ı䣬�õ��Ľ��һ��

	// �вι��췽��
	public Person(String name, float height, int age) {
		this.name = name;
		this.height = height;
		this.age = age;

	}

	public Person(String name) {
		this.name = name;

	}

	// �޲ι��췽��
	public Person() {

	}
	// ���أ�1����������ͬ 2�������ĸ�����ͬ 3�����������Ͳ�ͬ����˳��ͬ
	// ����һ���û��࣬����û������û��������룬�������

	@Override
	public String toString() {
		return "Person [age=" + age + ", name=" + name + ", height=" + height + ", hand=" + hand + "]";
	}

}
