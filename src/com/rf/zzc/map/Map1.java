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
		ha.put(st[0], "�ɶ�");
		ha.put(st[1], "����");
		ha.put(st[2], "���");
		ha.put(st[3], "����");
		ha.put(st[4], "�Ϻ�");
		ha.put(st[5], "����");
//		Set<Student> se1 =ha.keySet();  ��
//		TreeSet<Student> se = se1;      ��
		TreeSet<Student> se = new TreeSet<Student>(ha.keySet());//�൱�ڽ�����һ��TreeSet�Ķ���ȥʵ��һ��Set����
		Iterator<Student> it = se.iterator();
//	����	TreeSet<Student> se = new TreeSet<Student>();
//		se.addAll(se1);
		while (it.hasNext()) {
			Student st1 = it.next();
			System.out.println(st1 + "    " + ha.get(st1));
		}

	}

}
