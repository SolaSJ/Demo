package com.rf.zzc.demo1;

import java.util.Arrays;

public class Newmergesort {
	//归并排序
	public static void mergesort(int[] a, int low, int mid, int high) {
		int[] temp = new int[high - low + 1];
		int i = low;
		int j = mid + 1;
		int k = 0;
		while (i <= mid && j <= high) {
			if (a[i] < a[j]) {
				temp[k++] = a[i++];
			} else {
				temp[k++] = a[j++];
			}
		}
		while (i <= mid) {
			temp[k++] = a[i++];
		}
		while (j <= high) {
			temp[k++] = a[j++];
		}
		for (int n = 0; n < temp.length; n++) {
			a[low + n] = temp[n];
		}

	}

	public static void merge(int a[], int low, int high) {
		int mid = (low + high) / 2;
		if (low < high) {

			merge(a, low, mid);
			merge(a, mid + 1, high);
		}
		mergesort(a, low, mid, high);
	}

	public static void main(String[] args) {
		int a[] = { 11, 9, 24, 18, 18, 64, 2, 13, 72, 3, 1, 45 };
		merge(a, 0, a.length - 1);
		System.out.println(Arrays.toString(a));
		recursion(9, 9);
	}

	
	//用递归的方法写出九九乘法表。
	public static void recursion(int a, int b) {
		if (a == 1 && b == 1) {
			System.out.print("1x1=1");
		} else if (b == 0) {
			b = a - 1;
			recursion(a - 1, b);
			System.out.println();
		} else {
			recursion(a, b - 1);//递归里面有指针的存在，每次递归的数据或者赋值会被记录！所以不用担心每次a和b的值会回复到原来。
			System.out.print(b + "x" + a + "=" + a * b + "\t");
		}
		//注意实现的顺序是怎样的，倒序回来指针指示的步骤，怎么实现。
	}

}
