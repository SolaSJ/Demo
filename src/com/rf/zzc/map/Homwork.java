package com.rf.zzc.map;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;

public class Homwork {
	public static void main(String[] args) {

		// Person[] p1 = { new Person("01", "����"), new Person("02", "����") };
		// Person[] p2 = { new Person("03", "����"), new Person("04", "����") };
		//
		HashSet<Person> ha = new HashSet();
		ha.add(new Person("01", "����"));
		ha.add(new Person("02", "����"));
		HashSet<Person> ha1 = new HashSet();
		ha1.add(new Person("03", "����"));
		ha1.add(new Person("04", "����"));

		HashMap<String,HashSet > m1 = new HashMap<String,HashSet>();
		m1.put("���Ȱ�", ha);

		m1.put("J1701", ha1);
		
		Iterator<String> it = m1.keySet().iterator();
		while (it.hasNext()) {
			String s = it.next();
			System.out.println(s);
			HashSet<Person>k=m1.get(s);
			Iterator<Person>it1=k.iterator();
			while(it1.hasNext()){
				Person p1=it1.next();
				
				System.out.println("    " + p1);			
			}

		}

	}

}
