package com.rf.zzc.demo1;

import java.util.Scanner;

public class Student3 {
	public static void main(String[] args) {
		// Scanner stu = new Scanner(System.in);
		// int n = stu.nextInt();
		// System.out.println("������ĳɼ���" + n);
		// if (n >= 0 && n <= 100) {
		//
		// if (n >= 90) {
		// System.out.println("�ɼ�Ϊ����");
		//
		// } else if (n >= 60 && n < 90) {
		// System.out.println("�ɼ�Ϊ�ϸ�");
		//
		// } else {
		// System.out.println("�ɼ�Ϊ������");
		//
		// }
		// } else {
		// System.out.println("������ĳɼ���Ч");
		// }
		// Scanner xz = new Scanner(System.in);
		// String str = xz.next();
		// switch (str) {
		//
		// case "A":
		// System.out.println("���������A��");
		// break;
		// case "B":
		// System.out.println("���������B��");
		// break;
		// case "C":
		// System.out.println("���������C��");
		// break;
		// case "D":
		// System.out.println("���������D��");
		// break;
		// case "E":
		// System.out.println("���������E��");
		// break;
		// default:
		// System.out.println("�����Ч");
		// break;
		//
		// }
		// ѭ�� forѭ�� for(��ʼ�����ʽ;ѭ���������ʽ;ѭ����Ĳ������ʽ){//ִ�����

		// for(int i=0;i<100;i++){
		// System.out.println(i);
		// for (int i = 100; i > 0; i--)
		// ;
		//
		// System.out.println(i);

		// forѭ��
		// ע�������Ƕ�ף�i��������println,Ҳ��������1-9�����������£���j��Ƕ����i����ģ�j����i���仯���ܵ�
		// i�����ƶ��仯���˴��õ�print�ǲ����У�j��i�����ȫ��һ�����棬\t���Ʊ�������淶��ʽ��
		// for (int i = 1; i < 10; i++) {
		//
		// for (int j = 1; j <= i; j++) {
		// System.out.print(i + "x" + j + "=" + (i * j) + "\t");
		//
		// }
		// System.out.println();
		// }

		// whileѭ��

		int k = 1;// Ҫ�ȶ���k��ֵ���ܽ����ж�false��true

		while (k < 10) {
			int z = 1;// ��Ϊz����������ѭ����ɺ�����1��������ѭ���������������������������¸�ֵΪ1 ��
			// �����������while����ΪҪ�ڱ�Ƕ�׵���ѭ���⣬����ѭ�����档ѭ���Ǵ��⵽��
			while (z <= k) {

				System.out.print(k + "x" + z + "=" + (k * z) + "\t");

				z++;// z������
			}
			System.out.println();
			k++;

		}

		int a = 1;
		do {
			System.out.println(a);
			a++;
			// ��һ��ѭ����ɹ���a=2
		} while (a < 2);

		int b = 1;// while��do whileѭ����ֵ�������棬��for��������
		do {
			int c = 1;

			do {
				System.out.print(b + "x" + c + "=" + (b * c) + "\t");
				c++;

			} while (c <= b);

			b++;
			System.out.println();

		} while (b < 10);

		
		
		for (int e = 1; e < 10; e++) {
			for (int f = 1; f < 10; f++) {
				if (f == 4) {
					break;//�˴�Ϊ����ѭ������4���ѭ��Ҳ��ִ��
					//���Ϊcontinue��ֻ������4���ѭ���������Ĳ�Ӱ�죬�����ҲҪ����
				
				}
				System.out.print(e + "x" + f + "=" + (e * f) + "\t");

			}
			System.out.println();
			
		
		}
		
			for(int i=9;i>0;i--){
				for(int j=9;j>=i;j--){
					System.out.print(j+"x"+i+"="+(i*j+"\t"));
					
					
				}
				System.out.println();
				
			}
			for(int x=9;x>0;x--){
				for(int y=x;y>0;y--){
					System.out.print(x+"x"+y+"="+(x*y)+"\t");	
				}
				
				System.out.println();
			}
	}

}
