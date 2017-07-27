package io;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.ListIterator;
import java.util.Set;
import java.util.TreeSet;

public class Array {
	public static void main(String[] args) {
		Person p[] = { new Person(15, "bbb"), new Person(14, "mmm"), new Person(15, "bbb"), new Person(18, "肖帅"),
				new Person(14, "lll"), new Person(15, "aaa") };
		
		HashMap<Person, String> h = new HashMap();
		h.put(p[0], "成都");
		h.put(p[1], "北京");
		h.put(p[2], "深圳");
		h.put(p[3], "天津");
		h.put(p[4], "眉山");
		h.put(p[5], "河北");

		Set<Person> s = h.keySet();
		TreeSet<Person> set = new TreeSet<Person>(s);//相当于将set集合中的元素传给了TreeSet而不是强转
		Iterator<Person> it = set.iterator();
		while (it.hasNext()) {
			Person p1 = it.next();
			System.out.println(p1 + "     " + h.get(p1));
		}

	}
}
