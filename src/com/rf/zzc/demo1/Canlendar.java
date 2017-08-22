package com.rf.zzc.demo1;

import java.util.Calendar;

public class Canlendar {

	public static void main(String[] args) {
		month(2000,2);
	}
	public static void month(int a,int b){
		Calendar c=Calendar.getInstance();
		 c.set(a, b, 1);
		c.add(Calendar.DAY_OF_MONTH, -1);
		
		
		System.out.println(c.get(Calendar.DAY_OF_MONTH)) ;
	}
}
