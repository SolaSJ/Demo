//这个类是在此包下
package com.rf.zzc.demo1;
//public 公共的 表示外界可以访问的 

//class表示这是一个java类
//helloword表示的是一个类名

/*
 * 多行注释
 */

/**
 * 多行文本注释（可以注释作者及其他信息）
 * @author admin
 *
 */
public class HelloWord {
//main方法（main函数） 虚拟机（jvm)唯一识别入口
	public static void main(String[] args) {
		
//控制台输出语句，print为不换行，println要换行。或者加入"/n"来换行
		System.out.print("Hello word "+10*10+"我是周周");
		System.out.println(30+80);
		System.out.println("25250");
	}

}
