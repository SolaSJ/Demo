package io;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.ListIterator;
import java.util.Set;
import java.util.TreeSet;

public class Array {
	public static void main(String[] args) {
		Person p[] = { new Person(15, "bbb"), new Person(14, "mmm"), new Person(15, "bbb"), new Person(18, "Ф˧"),
				new Person(14, "lll"), new Person(15, "aaa") };
		
		HashMap<Person, String> h = new HashMap();
		h.put(p[0], "�ɶ�");
		h.put(p[1], "����");
		h.put(p[2], "����");
		h.put(p[3], "���");
		h.put(p[4], "üɽ");
		h.put(p[5], "�ӱ�");

		Set<Person> s = h.keySet();
		TreeSet<Person> set = new TreeSet<Person>(s);//�൱�ڽ�set�����е�Ԫ�ش�����TreeSet������ǿת
		Iterator<Person> it = set.iterator();
		while (it.hasNext()) {
			Person p1 = it.next();
			System.out.println(p1 + "     " + h.get(p1));
		}

	}
}
