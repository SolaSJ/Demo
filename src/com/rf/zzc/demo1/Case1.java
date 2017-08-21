package com.rf.zzc.demo1;

import java.util.Arrays;
import java.util.Scanner;

public class Case1 {

	public static void main(String[] args) {

	/*输出大写的A
	 * public static void printA(int a) {
		for (int i = a; i >= 1; i--) {
			for (int k = 1; k <= 2 * a; k++) {
				if (k == i || k + i == 2 * a) {
					System.out.print("*");
				} else if (i == a / 2 + 1 && (k + i) <= a * 2 && k >= i) {
					System.out.print("*");
				} else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	*/
		
	//选择排序，在这里外循环代表的不是次数。之所以长度减一是因为为了使数组长度不越界。
		int arr[]={12,21,30,8,9,7,6,58};
		for(int i=0;i<arr.length-1;i++){
			for(int j=i+1;j<arr.length;j++){
				if(arr[i]>arr[j]){
					int temp=arr[j];
					arr[j]=arr[i];
					arr[i]=temp;
					
				}
			}
		}
		System.out.println(Arrays.toString(arr));
		
	}	
	
}
