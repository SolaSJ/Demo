package com.rf.zzc.demo1;

public class Single {

	// private Single(){
	//
	// }
	// static Single s=new Single();//static��̬�ĵ��ñ���
	// public static Single getSingle(){
	// return s;
	// }
	// ����ʽ

	
	
	//����ʽ  
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
