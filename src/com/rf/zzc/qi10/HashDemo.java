package com.rf.zzc.qi10;

import java.util.HashSet;
import java.util.Iterator;

public class HashDemo {
	public static void main(String[] args) {
		hash();
	}

	public static void hash() {

		Person person1 = new Person("zhang", 18);
		Person person2 = new Person("wang", 18);
		Person person3 = new Person("liu", 18);
		Person person4 = new Person("lin", 18);
		Person person5 = new Person("zhang", 18);
		HashSet<Person> hs = new HashSet<>();
		HashSet<Person> hs1 = new HashSet<>();
		hs.add(person1);
		hs.add(person2);
		hs.add(person3);
		hs.add(person4);
		hs.add(person5);
		Iterator<Person> it = hs.iterator();
		while(it.hasNext()){
			Person p=it.next();
			if(!hs1.contains(p)){
				hs1.add(p);
			}
		}
		System.out.println(hs1);

	}
}
