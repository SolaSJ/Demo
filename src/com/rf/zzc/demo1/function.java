package com.rf.zzc.demo1;

import java.util.Scanner;

public class function {

	public static void main(String[] args) {
		// System.out.println("�����·�");
		// Scanner scan = new Scanner(System.in);
		//
		//
		// while(true){
		// int a=scan.nextInt();
		//
		// System.out.println(function2(a));
		// }
		//
		// }

		// public static int function2(int a) {
		// if (a == 1 || a == 2) {
		// return 1;
		//
		// } else {
		// return function2(a - 1) + function2(a - 2);
		//
		// }

		// һά����
		// int[] arr=new int[]{1,2,3,4};//int[]
		// arr={4,8,9,11};������ʽҲ�ǿ��Եģ�ֱ�Ӱ�ÿ��������ʾ������
		// //Ĭ��������е����ֶ�����
		// //arr[0]������������ĵ�һ��Ԫ�أ�0������ĽǱ�,��4����
		// //system.out println(arr.length);��ô�������ֱ�ӵõ��������ĳ��� 4
		// //System.out.println(arr[0]);
		// System.out.print("{");
		// for(int a=0;a<arr.length-1;a++){
		// System.out.print(arr[a]+",");
		//
		// }
		// System.out.print(arr[arr.length-1]);
		// System.out.print("}");
		//

		// �� ��ά����
		// ����int[][] arr={{1,2,3},{3,4,5},{6,7,8}};
		// �����4�������ʱӦ����system.ou.println(arr[1][1])
		// System.out.println(" "+" "+" "+" "+"*");
		// System.out.println(" "+" "+" "+"*"+" "+"*");
		// System.out.println(" "+" "+"*"+"*"+"*"+"*"+"*");
		// System.out.println(" "+"*"+" "+" "+" "+" "+" "+"*");
		// System.out.println("*"+" "+" "+" "+" "+" "+" "+" "+"*");
		// for (int i = 5; i >= 1; i--) {
		// for (int k = 1; k <= 10; k++) {
		// if (k == i || k + i == 10) {
		// System.out.print("*");
		// } else if (i == 3 && (k + i) <= 10 && k > i) {
		// System.out.print("*");
		//
		// } else
		//
		// {
		// System.out.print(" ");
		// }
		// }
		//
		// System.out.println();
		// }

		int[] arr = { 1, 2, 3, 4, 5 };
		int max = arr[0];
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] > max) {
				max = arr[i];
				
			}
			
		}
		System.out.println(max);

	}

}
