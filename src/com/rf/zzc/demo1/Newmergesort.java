package com.rf.zzc.demo1;

import java.util.Arrays;

public class Newmergesort {
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
		 merge(a, 0, a.length-1);
		 System.out.println(Arrays.toString(a));
		

	}

//	public static void add(int[] a, int low, int mid, int high) {
//		int[] temp = new int[high - low + 1];
//		int i = low;
//		int j = mid + 1;
//		int k = 0;
//		while (i <= mid && j <= high) {
//			if (a[i] < a[j]) {
//				temp[k++] = a[i++];
//			} else {
//				temp[k++] = a[j++];
//			}
//		}
//		while (i <= mid) {
//			temp[k++] = a[i++];
//		}
//		while (j <= high) {
//			temp[k++] = a[j++];
//		}
//		for (int n = 0; n < temp.length; n++) {
//			a[n + low] = temp[n];
//		}
//	}
//
//	public static void add2(int[] a, int low, int high) {
//		int mid = (low + high) / 2;
//		if (low < high) {
//			add2(a, low, mid);
//			add2(a, mid + 1, high);
//			add(a, low, mid, high);
//		}
//	}

}
