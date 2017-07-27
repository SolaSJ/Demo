package com.rf.zzc.map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

import com.rf.zzc.qi10.Treeset;

public class Map1 {
	public static void main(String[] args) {
		Student[] st = { new Student("zhang", 18), new Student("wang", 17), new Student("liu", 16),
				new Student("zhang", 18),new Student("wang", 18),new Student("liu", 20) };
		HashMap<Student, String> ha = new HashMap<>();
		ha.put(st[0], "成都");
		ha.put(st[1], "重庆");
		ha.put(st[2], "天津");
		ha.put(st[3], "北京");
		ha.put(st[4], "上海");
		ha.put(st[5], "广州");
//		Set<Student> se1 =ha.keySet();  错
//		TreeSet<Student> se = se1;      错
		TreeSet<Student> se = new TreeSet<Student>(ha.keySet());//相当于建立了一个TreeSet的对象去实现一个Set对象
		Iterator<Student> it = se.iterator();
//	或者	TreeSet<Student> se = new TreeSet<Student>();
//		se.addAll(se1);
		while (it.hasNext()) {
			Student st1 = it.next();
			System.out.println(st1 + "    " + ha.get(st1));
		}

	}

}
