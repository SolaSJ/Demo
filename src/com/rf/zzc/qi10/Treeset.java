package com.rf.zzc.qi10;

import java.util.Iterator;
import java.util.TreeSet;

public class Treeset {
	public static void main(String[] args) {
		tree();
	}

	public  static void tree() {
		Student s1 = new Student("zhang", 19);
		Student s2 = new Student("liu", 17);
		Student s3 = new Student("wangwu", 18);
//������������new Student()��������������ʵĿ���Ǵ��루���߸��ģ��������ʵ�ֵ�comparator�ıȽϷ���(����˵����˱Ƚ���)
//��Ϊ��Student���й������޲ι��췽��������new Student()�Ͳ���Ҫ���Ρ�
		TreeSet<Student> tr = new TreeSet<>(new Student());
		tr.add(s1);
		tr.add(s2);
		tr.add(s3);
		System.out.println(tr);

	}
}
