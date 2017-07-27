package com.rf.zzc.qi10;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Scanner;
import java.lang.Character;
import java.text.SimpleDateFormat;

public class Test {
	public static void main(String[] args) {

		SimpleDateFormat sm = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss E");

		System.out.println(sm.format(new Date()));
		// ����ת��
		Animal c = new Cat();

		eat(c);// ��⸲�ǺͶ�̬ ���ص�
		Animal dog = new Dog();
		eat(dog);
		// ����ת��
		Dog d = (Dog) dog;
		d.mouse();
		num();
		System.out.println(rd(3, 4));
		System.out.println(btoB('A'));
		System.out.println(Arrays.toString(jiaoji()));
		// hanzi();
		int arr[] = { 1, 1, 4, 1, 5, 2, 6, 3, 3, 3 };
		ziji(arr);
		jihelei();
		cun();
	}

	public static void eat(Animal a) {
		a.eat();
	}

	// ����ȥ��
	public static void num() {
		int[] arr = { 1, 2, 1, 1, 2, 3, 5, 4 };
		Arrays.sort(arr);
		System.out.print("{1,");
		for (int i = 0; i < arr.length - 1; i++) {
			if (arr[i + 1] > arr[i]) {
				if (i + 1 == arr.length - 1) {
					System.out.print(arr[i + 1]);
				} else {
					System.out.print(arr[i + 1] + ",");
				}

			}
		}

		System.out.println("}");
	}

	// �����εĵ�����
	public static double rd(int a, int b) {
		return Math.sqrt(Math.pow(a, 2) + Math.pow(b, 2));

	}

	// ��Сдת��
	public static char btoB(char abc) {

		if (Character.isLowerCase(abc)) {
			return Character.toUpperCase(abc);
		} else if (Character.isUpperCase(abc)) {
			return Character.toLowerCase(abc);

		}
		return '0';

	}

	// �󽻼�
	public static int[] jiaoji() {
		int[] arr1 = { 0, 1, 2, 3, 4 };
		int[] arr2 = { 3, 4, 5, 5 };
		int[] arr3 = new int[arr1.length];
		int index = 0;
		for (int i = 0; i < arr1.length; i++) {
			for (int j = 0; j < arr2.length; j++) {
				if (arr1[i] == arr2[j]) {
					arr3[index++] = arr1[i];
				}
			}
		}

		int[] arr4 = Arrays.copyOf(arr3, index);
		return arr4;
	}

	public static void hanzi() {
		System.out.println("�����밢��������");
		Scanner scan = new Scanner(System.in);
		int a = scan.nextInt();
		char[] arr1 = { '��', 'Ҽ', '��', '��', '��', '��', '�', '��', '��', '��' };
		char[] arr2 = { 'ʰ', '��', 'Ǫ', '��', 'ʰ', '��', 'Ǫ', '��', 'ʰ', '��', 'Ǫ' };
		char[] arr3 = new char[25];
		int temp = 10;
		int index = 0;
		for (int i = 0; i < 12; i++) {
			arr3[index++] = arr1[(a % 10)];
			arr3[index++] = arr2[i];
			a = a / 10;
			if (a == 0) {
				break;
			}

		}
		for (int j = index - 2; j >= 0; j--) {
			System.out.print(arr3[j]);
		}
	}

	public static void ziji(int[] arr) {
		Arrays.sort(arr);
		System.out.println(Arrays.toString(quchong(arr)));
		while (true) {
			int arr1[] = new int[arr.length];
			int index = 0;

			for (int i = 0; i < arr.length - 1; i++) {
				if (arr[i] == arr[i + 1]) {

					arr1[index++] = arr[i];
				}

			}
			arr = Arrays.copyOf(arr1, index);

			System.out.println(Arrays.toString(quchong(arr)));
			if (arr.length == quchong(arr).length) {
				break;
			}
		}
	}

	public static int[] quchong(int[] arr) {
		Arrays.sort(arr);
		int arr1[] = new int[arr.length];
		arr1[0] = arr[0];
		int index = 1;
		for (int i = 0; i < arr.length - 1; i++) {
			if (arr[i + 1] > arr[i]) {
				arr1[index++] = arr[i + 1];

			}
		}
		int[] arr2 = Arrays.copyOf(arr1, index);
		return arr2;
	}

	public static void jihelei() {
		List<Object> it = new ArrayList<Object>();
		List<Object> it1 = new ArrayList<Object>();
		it.add("����");
		it.add("�ܴ�ү");
		it.add(18);
		it.add("���²���");
		it1.add("����");
		it1.add("����");
		it1.add(20);

		// foreach�ľ����÷���ѭ���������ϣ�
		for (Object zj : it) {
			System.out.print(zj);

		}

		// ���������������������ָ��������Ķ��󣩣���ѭ���������ϵĶ���
		// ����ĵ�hasNext��next�Ǿ���ķ�����
		Iterator<Object> he = it.iterator();
		while (he.hasNext()) {
			System.out.println(he.next());
			;
		}
		System.out.println();
		System.out.println(it);
		System.out.println(it1);

		ListIterator<Object> ir = it.listIterator();
		while (ir.hasNext()) {
			System.out.println(ir.next());
			;
		}
		while (ir.hasPrevious()) {// ���ǵ�ָ�룬�����ǰһ��Ԫ�أ�Ϊtrue������Ϊ���ǰһ��Ԫ��
			System.out.println(ir.previous());
			;
		}

	}

	
	
//	ArrayList�����ж����ȥ��
	public static void cun() {
		Person person1 = new Person("zhang", 18);
		Person person2 = new Person("wang", 18);
		Person person3 = new Person("liu", 18);
		Person person4 = new Person("lin", 18);
		Person person5 = new Person("zhang", 18);
		
		ArrayList<Person> list = new ArrayList<>();
		list.add(person1);
		list.add(person2);
		list.add(person3);
		list.add(person4);
		list.add(person5);
		ArrayList<Person> list1 = new ArrayList<>();

	
		ListIterator<Person> di = list.listIterator();
		while (di.hasNext()) {
			Person p = di.next();
			if (!list1.contains(p)) {
				list1.add(p);
			}

		}
		
		System.out.println(list1);

	}

}
