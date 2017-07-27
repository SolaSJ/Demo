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
//在这里输入了new Student()这个对象参数，其实目的是传入（或者更改）这个对象实现的comparator的比较方法(或者说变更了比较器)
//因为在Student类中构造了无参构造方法，所以new Student()就不需要传参。
		TreeSet<Student> tr = new TreeSet<>(new Student());
		tr.add(s1);
		tr.add(s2);
		tr.add(s3);
		System.out.println(tr);

	}
}
