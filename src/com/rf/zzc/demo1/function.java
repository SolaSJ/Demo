package com.rf.zzc.demo1;

import java.util.Scanner;

public class function {

	public static void main(String[] args) {
		// System.out.println("输入月份");
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

		// 一维数组
		// int[] arr=new int[]{1,2,3,4};//int[]
		// arr={4,8,9,11};这种形式也是可以的，直接把每个数都表示出来了
		// //默认数组的中的数字都是零
		// //arr[0]代表数组里面的第一个元素，0是数组的角标,有4个数
		// //system.out println(arr.length);这么输出可以直接得到这个数组的长度 4
		// //System.out.println(arr[0]);
		// System.out.print("{");
		// for(int a=0;a<arr.length-1;a++){
		// System.out.print(arr[a]+",");
		//
		// }
		// System.out.print(arr[arr.length-1]);
		// System.out.print("}");
		//

		// 二 二维数组
		// 例子int[][] arr={{1,2,3},{3,4,5},{6,7,8}};
		// 其输出4这个数字时应该是system.ou.println(arr[1][1])
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
