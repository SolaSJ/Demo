package com.rf.zzc.demo1;

import java.util.Scanner;

import javax.swing.JOptionPane;

public class Study2 {
	// ʮ����ת��Ϊ�����ƣ����ǲ��õ��� ���෨������Ϊ2 ȡ�����ķ�����
	// ������ת��Ϊʮ���ƣ����ǲ��õ��� ���ݶ�����λ���������� ��2��0�η���ʼ�ۼ�
	// �෴��ȡ�����ƣ���������������� �����1 001111
	// int a = 18280305934;// ����ȡֵ��Χ
	char b = 'a';// char�����Ǽӵ�����
	// float c2 = 1.1;// Ĭ��Ϊdouble���ͣ���ɾ�����ʧ����float d=2ȴ����ȷ��
	float d = 2;
	float c = (float) 1.1;// д��1��ǿת
	float c1 = 1.2f;// д��2��ǿת
	String stuname = "hgukgbukgugv";// StringΪ�ַ������ͣ��������ڰ˴�����������ͣ�������������

	public static void main(String[] args) {
		int e = (int) (Math.random() * 7) + 1;// (
												// Math.random())ȡ0��1֮���С��������0��������1
		int a1 = 0;
		a1 = (int) e;
		System.out.println(a1);

		int a2 = 6;
		// ��Ϊa++���ȸ�ֵ�����㣬 a++=6 �����a=7
		System.out.println("a2++=" + a2++);

		System.out.println("a2=" + a2);
		// ��Ϊa--���ȸ�ֵ�����㣬a--=7 �����a=7
		System.out.println("a2--=" + a2--);
		// ��Ϊa--���ȸ�ֵ�����㣬a--=6 �����a=5
		System.out.println(a2--);
		System.out.println(a2);
		// ��--a�����������ٸ�ֵ

		// System.out.println(a>b?true:false);Ϊ��Ŀ�����

		System.out.println(1 == 2);// false

		System.out.println(8 & 6);// �ȶ�ת��Ϊ�����ƣ������Ƚϣ�λ��������ͬΪ1��Ϊ�����ֲ�ͬΪ0��ȡֵ����תΪʮ����

		System.out.println(~6);// �Ȱ�ʮ����ת��Ϊ�����ƣ��ٷ��룬��ֱ�ӽ����

		Scanner scan = new Scanner(System.in);
		int num = scan.nextInt();
		System.out.println("���������" + num);

		if (num >= 100 && num <= 999) {
			System.out.println("��һ����λ��");

			int a = num / 100;// ȡ��
			int b = (num - a * 100) / 10;// int b=(num/10)%10,Ŀ����ȡ��
			int c = (num - a * 100 - b * 10);// int c=num%10,Ŀ����ȡ��

			if (a * a * a + b * b * b + c * c * c == num) {
				System.out.println("����һ��ˮ�ɻ���");

			} else {
				System.out.println("�ⲻ��һ��ˮ�ɻ���");

			} // �ж�һ����λ���ǲ���ˮ�ɻ���

		} else {
			System.out.println("����һ����λ��");
			// String str= JOptionPane.showInputDialog("������һ������")
			// �ַ���ת��Ϊint����
			// int s=Integer.parseInt(str)
			

		}
	
			for(int i=9;i>0;i--){
				for(int j=9;j>0;j--){
					System.out.print(i+"x"+j+"="+(i*j+"\t"));
					j--;
					
				}
				System.out.println();
				
			}

	}
}
