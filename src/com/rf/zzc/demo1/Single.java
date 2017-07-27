package com.rf.zzc.demo1;

public class Single {

	// private Single(){
	//
	// }
	// static Single s=new Single();//static静态的调用必须
	// public static Single getSingle(){
	// return s;
	// }
	// 饿汉式

	
	
	//懒汉式  
	private static Single s = null;

	private Single() {

	}

	public  Single getSingle() {
		if (s == null) {
			synchronized (Single.class) {
				if (s == null) {
					s = new Single();
				}
			}
		}
		return s;
	}
	

}
