package com.rf.zzc.demo1;

import java.util.Scanner;

import javax.swing.JOptionPane;

public class Study2 {
	// 十进制转换为二进制，我们采用的是 除余法（除数为2 取余数的方法）
	// 二进制转换为十进制，我们采用的是 根据二进制位，从左至右 从2的0次方开始累加
	// 相反数取二进制，是他本身二进制码 补码加1 001111
	// int a = 18280305934;// 超出取值范围
	char b = 'a';// char类型是加单引号
	// float c2 = 1.1;// 默认为double类型，造成精度损失，但float d=2却是正确的
	float d = 2;
	float c = (float) 1.1;// 写法1：强转
	float c1 = 1.2f;// 写法2：强转
	String stuname = "hgukgbukgugv";// String为字符串类型，并不属于八大基本数据类型，属于引用类型

	public static void main(String[] args) {
		int e = (int) (Math.random() * 7) + 1;// (
												// Math.random())取0到1之间的小数，包含0，不包含1
		int a1 = 0;
		a1 = (int) e;
		System.out.println(a1);

		int a2 = 6;
		// 因为a++是先赋值后运算， a++=6 运算后a=7
		System.out.println("a2++=" + a2++);

		System.out.println("a2=" + a2);
		// 因为a--是先赋值后运算，a--=7 运算后a=7
		System.out.println("a2--=" + a2--);
		// 因为a--是先赋值后运算，a--=6 运算后a=5
		System.out.println(a2--);
		System.out.println(a2);
		// 而--a就是先运算再赋值

		// System.out.println(a>b?true:false);为三目运算符

		System.out.println(1 == 2);// false

		System.out.println(8 & 6);// 先都转换为二进制，再做比较，位上数字相同为1，为上数字不同为0，取值后，再转为十进制

		System.out.println(~6);// 先把十进制转换为二进制，再反码，得直接结果。

		Scanner scan = new Scanner(System.in);
		int num = scan.nextInt();
		System.out.println("您输入的是" + num);

		if (num >= 100 && num <= 999) {
			System.out.println("是一个三位数");

			int a = num / 100;// 取整
			int b = (num - a * 100) / 10;// int b=(num/10)%10,目的是取余
			int c = (num - a * 100 - b * 10);// int c=num%10,目的是取余

			if (a * a * a + b * b * b + c * c * c == num) {
				System.out.println("这是一个水仙花数");

			} else {
				System.out.println("这不是一个水仙花数");

			} // 判断一个三位数是不是水仙花数

		} else {
			System.out.println("不是一个三位数");
			// String str= JOptionPane.showInputDialog("请输入一个数字")
			// 字符串转换为int类型
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
