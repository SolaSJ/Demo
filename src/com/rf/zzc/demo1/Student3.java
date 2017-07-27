package com.rf.zzc.demo1;

import java.util.Scanner;

public class Student3 {
	public static void main(String[] args) {
		// Scanner stu = new Scanner(System.in);
		// int n = stu.nextInt();
		// System.out.println("您输入的成绩是" + n);
		// if (n >= 0 && n <= 100) {
		//
		// if (n >= 90) {
		// System.out.println("成绩为优秀");
		//
		// } else if (n >= 60 && n < 90) {
		// System.out.println("成绩为合格");
		//
		// } else {
		// System.out.println("成绩为不及格");
		//
		// }
		// } else {
		// System.out.println("您输入的成绩无效");
		// }
		// Scanner xz = new Scanner(System.in);
		// String str = xz.next();
		// switch (str) {
		//
		// case "A":
		// System.out.println("您输入的是A等");
		// break;
		// case "B":
		// System.out.println("您输入的是B等");
		// break;
		// case "C":
		// System.out.println("您输入的是C等");
		// break;
		// case "D":
		// System.out.println("您输入的是D等");
		// break;
		// case "E":
		// System.out.println("您输入的是E等");
		// break;
		// default:
		// System.out.println("输出无效");
		// break;
		//
		// }
		// 循环 for循环 for(初始化表达式;循环条件表达式;循环后的操作表达式){//执行语句

		// for(int i=0;i<100;i++){
		// System.out.println(i);
		// for (int i = 100; i > 0; i--)
		// ;
		//
		// System.out.println(i);

		// for循环
		// 注意里面的嵌套：i是正常的println,也就是数字1-9正常从上往下，而j是嵌套再i里面的，j跟随i而变化并受到
		// i的限制而变化。此处用的print是不换行，j和i的输出全在一行里面，\t是制表符拿来规范格式。
		// for (int i = 1; i < 10; i++) {
		//
		// for (int j = 1; j <= i; j++) {
		// System.out.print(i + "x" + j + "=" + (i * j) + "\t");
		//
		// }
		// System.out.println();
		// }

		// while循环

		int k = 1;// 要先定义k的值才能进行判断false和true

		while (k < 10) {
			int z = 1;// 因为z在自增，当循环完成后不再是1，所以再循环自增过后跳出来后在这里重新赋值为1 ，
			// 放在外面这个while是因为要在被嵌套的内循环外，在外循环里面。循环是从外到内
			while (z <= k) {

				System.out.print(k + "x" + z + "=" + (k * z) + "\t");

				z++;// z在自增
			}
			System.out.println();
			k++;

		}

		int a = 1;
		do {
			System.out.println(a);
			a++;
			// 第一次循环完成过后a=2
		} while (a < 2);

		int b = 1;// while和do while循环赋值都在外面，而for则在里面
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
					break;//此处为跳出循环而且4这个循环也不执行
					//如果为continue则只是跳出4这个循环，其他的不影响，后面的也要继续
				
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
